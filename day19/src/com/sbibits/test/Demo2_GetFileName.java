package com.sbibits.test;

import java.io.File;

public class Demo2_GetFileName {
    /*
     * A:������ʾ �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
     */
    public static void main(String[] args) {
        // demo1();
        File dir = new File("E:\\");
        File[] arr = dir.listFiles();// ��ȡE�������е��ļ����ļ��ж���
        for (File file2 : arr) {
            if (file2.isFile() && file2.getName().endsWith(".JPG")) {
                System.out.println(file2);
            }
        }
    }

    private static void demo1() {
        File file = new File("E:\\");// ���ֻ���õ�E���µ�,�������E���µ�ĳ���ļ��������.jpg�ļ����Ҳ�����
        String[] arr = file.list();
        for (String string : arr) {
            if (string.contains(".JPG")) {
                System.out.println(string);
            }
        }
    }

}
