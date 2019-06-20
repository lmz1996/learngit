package com.sbibits.file;

import java.io.File;

/*
 * File(String pathname)������һ��·���õ�File����
 * File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 * File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 */
public class Demo1_File {
    public static void main (String[] args) {
//        demo1();
//        demo2();
        //���������
        File parent = new File("D:\\Java\\jdk1.8.0_144");
        //�Ѹ���·����װ��һ������
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
        File file = new File("D:\\Java\\jdk1.8.0_144\\bin");//ͨ������·����ȡfile������Ϊ\��ת���ַ������ڶ�дһ��
        System.out.println(file.exists());
        //���·�������ĳ��λ��,��eclipse����ָ��ǰ��Ŀ��,��dos��
        File file1 = new File("aaa.txt");
        System.out.println(file1.exists());

        File file2 = new File("yyy.txt");
        System.out.println(file2.exists());
    }
}
