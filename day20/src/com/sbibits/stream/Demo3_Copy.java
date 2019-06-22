package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {
    public static void main(String[] args) throws IOException {
//        copy_picture();
//        copy_mp3();//第一种copy方式太慢不推荐使用
        /*
         * 当要copy的文件稍微大点的时候一个字节一个字节的read和write会很慢
         * 有多少个字节就要read多少次还要加上write的次数效率特别低
         * 我们为了解决这个方法可以拿一个容器把这些字节流装起来一起传输
         * 我们可以把所有的字节放到一个数组中然后把这个数据全部write到文件中
         * 弊端:有可能会内存溢出 
         * 分析:虽然速度很快但是在开发中不推荐这么干,因为如果一个电影文件5个G那么就会创建一个
         * 5个G的字节数组,我们的虚拟机是虚拟在我们的内存中也就170MB左右你放了个5个G的就会出现内存溢出
         */
//     copy_allsend();//第二种方式不推荐使用有可能会导致内存溢出
    }

    private static void copy_allsend() throws FileNotFoundException, IOException {
        // 创建输入流对象关联music.mp3
            FileInputStream fis = new FileInputStream("music.mp3");
            // 创建输出流对象,关联到copy.mp3如果没有自动创建
            FileOutputStream fos = new FileOutputStream("copy.mp3");
//        int len = fis.available();//获取所有的字节数
            byte[] arr = new byte[fis.available()];
            fis.read(arr);//将文件上的字节读取到内存中也就是这个数组中
            fos.write(arr);//将字节数字中的字节数据全部写到文件上
            fis.close();
            fos.close();
    }

    private static void copy_mp3() throws FileNotFoundException, IOException {
        // 创建输入流对象关联music.mp3
            FileInputStream fis = new FileInputStream("music.mp3");
            // 创建输出流对象,关联到copy.mp3如果没有自动创建
            FileOutputStream fos = new FileOutputStream("copy.mp3");
            int b;
            // 不断地读取每一个字节
            while ((b = fis.read()) != -1) {
                // 将每一个字节写出
                fos.write(b);
            }
            // 关闭IO流
            fis.close();
            fos.close();
    }

    private static void copy_picture() throws FileNotFoundException, IOException {
        // 创建输入流对象关联look.jpg
        FileInputStream fis = new FileInputStream("look.jpg");
        // 创建输出流对象,关联到copy.jpg如果没有自动创建
        FileOutputStream fos = new FileOutputStream("copy.jpg");
        int b;
        // 不断地读取每一个字节
        while ((b = fis.read()) != -1) {
            // 将每一个字节写出
            fos.write(b);
        }
        // 关闭IO流
        fis.close();
        fos.close();
    }

}
