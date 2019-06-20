package com.sbibits.test;

import java.io.File;

public class Demo2_GetFileName {
    /*
     * A:案例演示 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
     */
    public static void main(String[] args) {
        // demo1();
        File dir = new File("E:\\");
        File[] arr = dir.listFiles();// 获取E盘下所有的文件和文件夹对象
        for (File file2 : arr) {
            if (file2.isFile() && file2.getName().endsWith(".JPG")) {
                System.out.println(file2);
            }
        }
    }

    private static void demo1() {
        File file = new File("E:\\");// 这个只能拿到E盘下的,如果我在E盘下的某个文件下有这个.jpg文件是找不到的
        String[] arr = file.list();
        for (String string : arr) {
            if (string.contains(".JPG")) {
                System.out.println(string);
            }
        }
    }

}
