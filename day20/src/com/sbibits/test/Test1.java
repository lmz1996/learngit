package com.sbibits.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    // ��ͼƬ����,һ����������һ����������ξ��Ǳ���
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("look.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("dd.jpg"));
        //���ܳɹ����ļ��ʹ򲻿���,����Ҫ��dd.txt���������ļ�һ����������һ����������ξ��Ǳ���
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
