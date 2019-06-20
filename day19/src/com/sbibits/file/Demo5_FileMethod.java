package com.sbibits.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {

    public static void main(String[] args) throws IOException {
        /*
         * A:获取功能
            * public String getAbsolutePath()：获取绝对路径
            * public String getPath():获取路径,获取你构造方法里面传递的路径
            * public String getName():获取文件或者文件夹名称
            * public long length():获取内容长度。字节数
            * public long lastModified():获取最后一次的修改时间，毫秒值
            * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组,只是为了获取名字
            * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 ,拿的是file对象,可以操作
         */
//        demo1();
//        demo2();
        File file = new File("D:\\work\\workspace\\day19\\aaa");
        File[] subFiles = file.listFiles();
        for (File file2 : subFiles) {
            System.out.println(file2);
        }
    }

    private static void demo2() {
        File file = new File("D:\\work\\workspace\\day19\\aaa");
        String[] arr = file.list();
        for (String string : arr) {
            System.out.println(string);
        }
    }

    private static void demo1() {
        File file = new File("dddsss.txt");
        Date d = new Date(file.lastModified());
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:dd");
        System.out.println(date.format(d));
    }

}
