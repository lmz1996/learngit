package com.sbibits.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

    public static void main(String[] args) throws IOException {
        //����һ�������������yyy.txt�����
        FileWriter fw = new FileWriter("yyy.txt");
//        ���Ҫд���ַ�, ��Ҫ���ַ�תΪ�ֽ���д��.��������ֽڷ�������ַ������0101��������
        fw.write("���ǵ�java�����Ѿ��ӽ�β����,��Ҽ���");
        fw.close();

    }

}
