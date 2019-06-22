package com.sbibits.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    // 给图片加密,一个数被另外一个数异或两次就是本身
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("look.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("dd.jpg"));
        //加密成功后文件就打不开了,就需要把dd.txt当做输入文件一个数被另外一个数异或两次就是本身
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("dd.jpg"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("123.jpg"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b ^ 123);
        }
        bis.close();
        bos.close();
    }

}
