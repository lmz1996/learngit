package com.sbibits.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
//��һ���ı��ĵ��ϵ��ı���ת,��һ�к͵�����һ�н���,�ڶ��к͵����ڶ��н���
/*
 * ����:
 * 1:����������
 * 2:�������϶���
 * 3:�����������ݴ洢��������
 * 4:���ű������Ͻ�����д���ļ���
 * 5:����
 */
    public static void main(String[] args) throws IOException {
        //ע������:�������������
        //1:����������
        BufferedReader br = new BufferedReader(new FileReader("readLine.txt"));
        //2:�������϶���
        List<String> list = new ArrayList<String>();

        //3:�����������ݴ洢��������
        String readLine;
        while ((readLine = br.readLine()) != null) {
            list.add(readLine);
        }
        br.close();//�������������
        BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
      //4:���ű������Ͻ�����д���ļ���
        for (int i = list.size() -1;i>=0;i--) {
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.close();
    }

}
