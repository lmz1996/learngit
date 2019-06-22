package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_Finally {
/*
 * 1.6版本IO流异常处理
 * 1:FileInputStream fis = new FileInputStream("aaa.txt");可能出现文件不存在
 * 2:FileOutputStream fos = new FileOutputStream("fff.txt");可能文件或路径不存在
 * 3:b=fis.read()可能出现文件不可读异常
 * 4:fos.write(b);可能出现文件不可写异常
 * 5:fos.close();可能出现文件关不上异常
 * 处理:1:我们需要把异常抛出去
 * 2:无论什么情况都要让流关掉
 */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("aaa.txt");
            fos = new FileOutputStream("fff.txt");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } finally {
            // 开始时设为null当对象没有建立成功的时候就不需要关闭流了
            try {
                if (fis != null) {
                    // 在关闭流的时候又可能出现特殊情况比如服务器崩了那么输入流没关成功,
                    // 我们起码要把输出流关上,为了稳妥起见还要加一层finally
                    fis.close();
                }
            } finally {
                // try finally的嵌套是为了能够关一个就关一个
                if (fos != null) {
                    fos.close();
                }
            }

        }

    }
}