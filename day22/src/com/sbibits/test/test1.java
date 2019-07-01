package com.sbibits.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test1 {
/*
 * 定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
 * 分析:
 * 1:read(byte[] b)方法是字节输入流的方法,创建FileInputStream,关联a.txt
 * 2:创建内存输出流,将读到的数据写到内存输出流中
 * 3:创建字节数组长度为5（长度为5转换的时候容易乱码,所以创建内存输出流将读到的数据写到内存输出流中,然后将内存输出流中的数据全部转换成字符串打印）
 * 4:将内存输出流中的数据打印
 * 5:关流
 * 
 */
    public static void main(String[] args) throws IOException {
        // 1:创建FileInputStream,关联a.txt
        FileInputStream fis = new FileInputStream("aaa.txt");
        // 2:创建内存输出流,将读到的数据写到内存输出流中
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // 3:创建字节数组长度为5
        byte[] arr = new byte[5];
        int len;
        while ((len = fis.read(arr)) != -1) {// 将文件上的数据读到字节数组中
            baos.write(arr,0,len);// 将字节数组的数据写到内存缓冲区中
            //把arr的从第0开始有多少个就写多少
        }
        // 4:将内存输出流中的数据打印
        System.out.println(baos);// 底层会自动调用toString()方法
        fis.close();

    }

}
