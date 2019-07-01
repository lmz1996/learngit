package com.sbibits.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_ByteArrayOutputStream {
/*
 * 1.什么是内存输出流
    * 该输出流可以向内存中写数据, 把内存当作一个缓冲区, 写出之后可以一次性获取出所有数据
* 2.使用方式
    * 创建对象: new ByteArrayOutputStream()
    * 写出数据: write(int), write(byte[])
    * 获取数据: toByteArray()
 */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        // 在内存中创建了可以增长的内存数组
        ByteArrayOutputStream baos = new ByteArrayOutputStream();// 一般是无参的参数是数组长度
        int a;
        while ((a = fis.read()) != -1) {
            baos.write(a);// 将读取的数据逐个放到内存中
        }
        // byte[] arr = baos.toByteArray();//将内存中的数据全部取出来
        // System.out.println(new String(arr));
        System.out.println(baos.toString());// 将内存中的内容转换成字符串,在输出语句中可以省略toString()方法,系统会默认帮你调用
        fis.close();
        // ByteArrayOutputStream不用close,本身是一个数组
    }

}
