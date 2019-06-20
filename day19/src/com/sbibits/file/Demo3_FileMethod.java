package com.sbibits.file;

import java.io.File;

public class Demo3_FileMethod {

    public static void main(String[] args) {
        /*
         * * A:��������ɾ������
            * public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
            * public boolean delete():ɾ���ļ������ļ���
            * B:������ע������
                * ���·������ͬ�����Ǹ�����
                * ���·������ͬ�����Ǹ��������С�
            * C:ɾ��ע�����
                * Java�е�ɾ�����߻���վ��
                * Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
         */
//        demo1();
        demo2();
    }

    private static void demo2() {
        File file = new File("ddww.txt");
        System.out.println(file.delete());

        File file1 = new File("sss");
        //Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
        //�����Ҫɾ���������ݵ���Ҫ����ɾ���ļ�Ȼ��ɾ���ļ���
        System.out.println(file1.delete());
    }

    private static void demo1() {
        File file = new File("yyy.md");
        File file1 = new File("ddww.txt");
        System.out.println(file.renameTo(file1));
        
        File file2 = new File("aaa.txt");
        File file3 = new File("D:\\ddww.txt");
        file2.renameTo(file3);
    }

}
