package com.sbibits.chario;

import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {

    public static void main(String[] args) throws IOException {
//      �ַ�����ȡ�ַ�, ��Ҫ�ȶ�ȡ���ֽ�����, Ȼ��תΪ�ַ�. ���Ҫд���ַ�, ��Ҫ���ַ�תΪ�ֽ���д��.
        FileReader fr = new FileReader("ttt.txt");//��������������,����aaa.txt
        int len;
//        �ַ�����ȡ�ַ�, ��Ҫ�ȶ�ȡ���ֽ�����, Ȼ��תΪ�ַ�
        while ((len = fr.read())!=-1) {//ͨ��Ĭ�ϵ����һ�ζ�ȡһ���ַ�
            System.out.print((char)len);//���������ַ�ǿת���ӡ
        }
        fr.close();
    }

}
