package com.sbibits.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test1 {
/*
 * ����һ���ļ�������,����read(byte[] b)����,��a.txt�ļ��е����ݴ�ӡ����(byte�����С����Ϊ5)
 * ����:
 * 1:read(byte[] b)�������ֽ��������ķ���,����FileInputStream,����a.txt
 * 2:�����ڴ������,������������д���ڴ��������
 * 3:�����ֽ����鳤��Ϊ5������Ϊ5ת����ʱ����������,���Դ����ڴ������������������д���ڴ��������,Ȼ���ڴ�������е�����ȫ��ת�����ַ�����ӡ��
 * 4:���ڴ�������е����ݴ�ӡ
 * 5:����
 * 
 */
    public static void main(String[] args) throws IOException {
        // 1:����FileInputStream,����a.txt
        FileInputStream fis = new FileInputStream("aaa.txt");
        // 2:�����ڴ������,������������д���ڴ��������
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // 3:�����ֽ����鳤��Ϊ5
        byte[] arr = new byte[5];
        int len;
        while ((len = fis.read(arr)) != -1) {// ���ļ��ϵ����ݶ����ֽ�������
            baos.write(arr,0,len);// ���ֽ����������д���ڴ滺������
            //��arr�Ĵӵ�0��ʼ�ж��ٸ���д����
        }
        // 4:���ڴ�������е����ݴ�ӡ
        System.out.println(baos);// �ײ���Զ�����toString()����
        fis.close();

    }

}
