package com.sbibits.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ttt.txt");
        // ����һ�������������aaa.txt�����,��������ڻ��Զ�����
        FileWriter fw = new FileWriter("aaa.txt");
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
//        writer������һ��1024���ַ��Ļ�����,Ҳ����2048���ֽ�,������������ݾͻ�ͣ����
//        ��������,�ر����Ὣ����������ˢ���ٹر�
//        fw.close();
        fw.close();
    }

}
