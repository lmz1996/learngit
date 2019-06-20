package com.sbibits.test;

import java.io.File;
import java.io.FilenameFilter;

public class Demo3_FileNameFilter {
    /*
     * A:文件名称过滤器的概述 public String[] list(FilenameFilter filter) public File[]
     * listFiles(FileFilter filter) B:文件名称过滤器的使用
     * 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称 C:源码分析 带文件名称过滤器的list()方法的源码
     */
    public static void main(String[] args) {
        File dir = new File("E:\\");
        String[] arr = dir.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                return file.isFile() && file.getName().endsWith(".JPG");
            }

        });
        for (String string : arr) {
            System.out.println(string);
        }
    }

}
