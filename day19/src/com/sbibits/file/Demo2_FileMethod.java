package com.sbibits.file;

import java.io.File;
import java.io.IOException;

public class Demo2_FileMethod {
/*
 * A:��������
    * public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
    * public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
    * public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
* B:������ʾ
    * File��Ĵ�������
    * ע�����
        * ����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
 */
    public static void main(String[] args) throws IOException {
        File file = new File("yyy.md");
        System.out.println(file.createNewFile());//��Ϊ�п��ܳ����쳣������Ҫ�׳��쳣

        File file1 = new File("sss");//�ļ��к���Ҳ�����к�׺��
        System.out.println(file1.mkdir());

        File file2 = new File("aaa//ddd");
        System.out.println(file2.mkdirs());
    }

}
