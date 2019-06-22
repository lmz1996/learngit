package com.sbibits.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class Test2 {
    /*
     * 在控制台录入文件的路径,将文件拷贝到当前项目下 分析: 1:定义一个方法获取键盘录入的文件路径,并封装成一个File对象返回 需要对文件进行校验
     * 2:进行copy
     */
    public static void main(String[] args) throws IOException {
        File file = getFile();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } finally {
            if (bis != null) {
                bis.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
    }

    public static File getFile() {
        // 定义一个键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        while (true) {
            String line = sc.nextLine();// 接收键盘输入的路径
            // 创建一个文件对象
            File file = new File(line);
            // 对文件进行校验
            if (!file.exists()) {
                System.out.println("文件不存在请重新输入:");
            } else if (file.isDirectory()) {
                System.out.println("您输入的是一个文件夹请重新输入:");
            } else {
                return file;// 是一个正常的文件返回文件路径
            }
        }
    }
}
