package com.sbibits.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5_MakeArrCopy {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ttt.txt");
        FileWriter fw = new FileWriter("bbb.txt");
        char[] arr = new char[1024];
        int len;
        while ((len = fr.read(arr)) != -1) {//���ļ��ϵ����ݶ�ȡ���ַ�������
            fw.write(arr, 0, len);//���ַ������е�����д���ļ���
        }
        fr.close();
        fw.close();
    }

}
