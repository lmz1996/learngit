package com.sbibits.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class Test2 {
    /*
     * �ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ�� ����: 1:����һ��������ȡ����¼����ļ�·��,����װ��һ��File���󷵻� ��Ҫ���ļ�����У��
     * 2:����copy
     */
    public static void main(String[] args) throws IOException {
        File file = getFile();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } finally {
            if (bis != null) {
                bis.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
    }

    public static File getFile() {
        // ����һ�������������
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ļ�·��");
        while (true) {
            String line = sc.nextLine();// ���ռ��������·��
            // ����һ���ļ�����
            File file = new File(line);
            // ���ļ�����У��
            if (!file.exists()) {
                System.out.println("�ļ�����������������:");
            } else if (file.isDirectory()) {
                System.out.println("���������һ���ļ�������������:");
            } else {
                return file;// ��һ���������ļ������ļ�·��
            }
        }
    }
}
