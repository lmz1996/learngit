package com.sbibits.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {

    public static void main(String[] args) throws IOException {
        /*
         * A:��ȡ����
            * public String getAbsolutePath()����ȡ����·��
            * public String getPath():��ȡ·��,��ȡ�㹹�췽�����洫�ݵ�·��
            * public String getName():��ȡ�ļ������ļ�������
            * public long length():��ȡ���ݳ��ȡ��ֽ���
            * public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
            * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������,ֻ��Ϊ�˻�ȡ����
            * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� ,�õ���file����,���Բ���
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
