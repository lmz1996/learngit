package com.sbibits.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
/*
 * 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出。
 * 分析:
 * 1:创建键盘录入对象
 * 2:创建输出流对象,关联text.txt文件
 * 3:定义无限循环
 * 4:遇到quit终止循环
 * 5:如果不是quit内容写入
 * 6:关流
 */
    public static void main(String[] args) throws IOException {
        // 1:创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容:");
        // 2:创建输出流对象,关联text.txt文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text.txt"));
        // 3:定义无限循环
        while (true) {
            String line = sc.nextLine();
            // 4:遇到quit终止循环
            if ("quit".equals(line)) {
                break;
            } else {
                // 5:如果不是quit内容写入
                bos.write(line.getBytes());// 字符串必须转换成字符
                bos.write("\r\n".getBytes());
            }

        }
        // 6:关流
        bos.close();
    }
}
