package com.sbibits.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
/*
 * ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����quitʱ���˳���
 * ����:
 * 1:��������¼�����
 * 2:�������������,����text.txt�ļ�
 * 3:��������ѭ��
 * 4:����quit��ֹѭ��
 * 5:�������quit����д��
 * 6:����
 */
    public static void main(String[] args) throws IOException {
        // 1:��������¼�����
        Scanner sc = new Scanner(System.in);
        System.out.println("����������:");
        // 2:�������������,����text.txt�ļ�
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text.txt"));
        // 3:��������ѭ��
        while (true) {
            String line = sc.nextLine();
            // 4:����quit��ֹѭ��
            if ("quit".equals(line)) {
                break;
            } else {
                // 5:�������quit����д��
                bos.write(line.getBytes());// �ַ�������ת�����ַ�
                bos.write("\r\n".getBytes());
            }

        }
        // 6:����
        bos.close();
    }
}
