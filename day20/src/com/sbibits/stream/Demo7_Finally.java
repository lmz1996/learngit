package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_Finally {
/*
 * 1.6�汾IO���쳣����
 * 1:FileInputStream fis = new FileInputStream("aaa.txt");���ܳ����ļ�������
 * 2:FileOutputStream fos = new FileOutputStream("fff.txt");�����ļ���·��������
 * 3:b=fis.read()���ܳ����ļ����ɶ��쳣
 * 4:fos.write(b);���ܳ����ļ�����д�쳣
 * 5:fos.close();���ܳ����ļ��ز����쳣
 * ����:1:������Ҫ���쳣�׳�ȥ
 * 2:����ʲô�����Ҫ�����ص�
 */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("aaa.txt");
            fos = new FileOutputStream("fff.txt");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } finally {
            // ��ʼʱ��Ϊnull������û�н����ɹ���ʱ��Ͳ���Ҫ�ر�����
            try {
                if (fis != null) {
                    // �ڹر�����ʱ���ֿ��ܳ�������������������������ô������û�سɹ�,
                    // ��������Ҫ�����������,Ϊ�����������Ҫ��һ��finally
                    fis.close();
                }
            } finally {
                // try finally��Ƕ����Ϊ���ܹ���һ���͹�һ��
                if (fos != null) {
                    fos.close();
                }
            }

        }

    }
}