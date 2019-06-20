package com.sbibits.file;

import java.io.File;

/*
 * File(String pathname)：根据一个路径得到File对象
 * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 */
public class Demo1_File {
    public static void main (String[] args) {
//        demo1();
//        demo2();
        //第三种最好
        File parent = new File("D:\\Java\\jdk1.8.0_144");
        //把父级路径封装成一个对象
        String child ="bin";
        File file = new File(parent,child);
        System.out.println(file.exists());
        System.out.println(parent.exists());
    }

    private static void demo2() {
        String parent = "D:\\Java\\jdk1.8.0_144";
        String child = "bin";
        File file = new File(parent,child);
        System.out.println(file.exists());
    }

    private static void demo1() {
        File file = new File("D:\\Java\\jdk1.8.0_144\\bin");//通过绝对路径获取file对象，因为\是转义字符所以在多写一个
        System.out.println(file.exists());
        //相对路径相对于某个位置,在eclipse下是指当前项目下,在dos下
        File file1 = new File("aaa.txt");
        System.out.println(file1.exists());

        File file2 = new File("yyy.txt");
        System.out.println(file2.exists());
    }
}
