package com.sbibits.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/*
 * * LineNumberReader��BufferedReader������, ������ͬ�Ĺ���, ���ҿ���ͳ���к�
    * ����getLineNumber()�������Ի�ȡ��ǰ�к�
    * ����setLineNumber()�����������õ�ǰ�к�
 */
public class Demo8_LineNumberReader {

    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("readLine.txt"));
        String line;
        lnr.setLineNumber(100);//ֻҪreadLineһ��LineNumber�ͼ�һ
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber()+":"+line);
        }
    }

}
