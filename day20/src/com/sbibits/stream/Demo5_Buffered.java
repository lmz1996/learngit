package com.sbibits.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_Buffered {
    public static void main(String[] args) throws IOException {
//        demo1();
     // 创建字节输入流对象,关联music.mp3
        FileInputStream fis = new FileInputStream("music.mp3");
        // 创建缓冲区对bis进行包装,内置了一个数组,一次能够存储8192个字节
        BufferedInputStream bis = new BufferedInputStream(fis);
//        上面的两部还可以写成
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("music.mp3"));
        // 创建字节输出流对象,关联copy.mp3
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        // 创建缓冲区对bos进行包装,内置了一个数组,一次能够存储8192个字节
        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp3"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
            //如果想要实时刷新缓冲区的话那样可以用flush(),否有close就行(close是只要装满了自动就会传输 ),flush()刷新后可以再次写入
            bos.flush();
        }
        bis.close();
        bos.close();
    }

    private static void demo1() throws FileNotFoundException, IOException {
        // 创建字节输入流对象,关联music.mp3
        FileInputStream fis = new FileInputStream("music.mp3");
        // 创建缓冲区对bis进行包装,内置了一个数组,一次能够存储8192个字节
        BufferedInputStream bis = new BufferedInputStream(fis);
        // 创建字节输出流对象,关联copy.mp3
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        // 创建缓冲区对bos进行包装,内置了一个数组,一次能够存储8192个字节
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
      //只关装饰后的对象即可（包装后的),不用相当于一个人他化妆了你把化妆时候的他干掉了是不是就是把他干掉了，不用考虑没化妆的了
        bis.close();
        bos.close();
    }
}
