package com.sbibits.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_ByteArrayOutputStream {
/*
 * 1.ʲô���ڴ������
    * ��������������ڴ���д����, ���ڴ浱��һ��������, д��֮�����һ���Ի�ȡ����������
* 2.ʹ�÷�ʽ
    * ��������: new ByteArrayOutputStream()
    * д������: write(int), write(byte[])
    * ��ȡ����: toByteArray()
 */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        // ���ڴ��д����˿����������ڴ�����
        ByteArrayOutputStream baos = new ByteArrayOutputStream();// һ�����޲εĲ��������鳤��
        int a;
        while ((a = fis.read()) != -1) {
            baos.write(a);// ����ȡ����������ŵ��ڴ���
        }
        // byte[] arr = baos.toByteArray();//���ڴ��е�����ȫ��ȡ����
        // System.out.println(new String(arr));
        System.out.println(baos.toString());// ���ڴ��е�����ת�����ַ���,���������п���ʡ��toString()����,ϵͳ��Ĭ�ϰ������
        fis.close();
        // ByteArrayOutputStream����close,������һ������
    }

}
