package com.sbibits.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo7_BufferedReadLine {
/*
 * �����������ַ����е����ⷽ��
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("readLine.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("www.txt"));
        String line;
//        BufferedReader��readLine()�������Զ�ȡһ���ַ�(���������з���)
        while ((line = br.readLine()) != null) {
            bw.write(line);
//            BufferedWriter��newLine()�������һ����ƽ̨�Ļ��з���"\r\n"
            bw.newLine();//������������ȫ��һ��
//            bw.write("\r\n");
            /*
             * newLine()��\r\n������
             * newLine()�ǿ�ƽ̨�ķ���
             * \r\nֻ������wondows
             */
        }
        br.close();
        bw.close();

    }

}
