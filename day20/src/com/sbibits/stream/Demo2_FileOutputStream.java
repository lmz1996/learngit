package com.sbibits.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

    public static void main(String[] args) throws IOException {
        // demo1();//创建一个新的
//        demo2();//原有的基础上追加
        
    }

    private static void demo1() throws FileNotFoundException, IOException {
        // 创建一个字节输出流,如果文件不存在则会按照路径创建一个文件,如果有就会将文件内容清空
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        // 虽然写出的是一个int数,但是到文件上是一个字节,会自动抹掉前三位
        // 可以在yyy.txt文件右键propertis上看,size是3bytes
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }

    private static void demo2() throws FileNotFoundException, IOException {
        // 创建一个字节输出流,如果文件不存在则会按照路径创建一个文件,如果有就会将文件内容清空
        // 如果想要继续之前的内容加入,那么就要在第二个参数上写true
        //FileOutputStream(File file, boolean append)
        FileOutputStream fos = new FileOutputStream("yyy.txt", true);
        // fos.write(100);//此时原来文件夹的内容已经被清空了,重新write
        fos.write(103);
        fos.close();
    }

}
