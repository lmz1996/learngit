package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {
/*
 * 为什么read返回一个字节用int而不用byte？
 * 1:会报错,因为int赋值给byte会损失精度
 * 2:因为FileInputStream是字节流读取,可以读取任何文件.音频视频但是必须要有结束标记-1
 * 如果返回的是byte每次读取都是一个8位   00001111 00000000 11111111当到11111111时会错误
 * 11111111就是一个byte类型的-1
 * 10000001是byte类型-1的原码,运算时以补码运算
 * 11111110 -1的反码
 * 11111111 是-1的补码那样子的话11111111就是-1那么会默认读完了没办法继续
 */
    public static void main(String[] args) throws IOException {
        // demo1();
        FileInputStream fis = new FileInputStream("aaa.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
        }
        // 关闭流释放资源
        fis.close();
    }

    private static void demo1() throws FileNotFoundException, IOException {
        // 创建一个字节输入流对象,aaa.txt是相对路径所以在本工程下
        FileInputStream fis = new FileInputStream("aaa.txt");
        // 一次读取一个字节,每read一次相当于指针向后面移了一位。
        int x = fis.read();
        System.out.println(x);
        int y = fis.read();
        System.out.println(y);
        int z = fis.read();
        System.out.println(z);
        // 如果出现-1了那么说明文件读完了。-1是文件的结束标记,也就是一个文件的结束条件
        int e = fis.read();
        System.out.println(e);
        // 关闭流释放资源
        fis.close();
    }

}
