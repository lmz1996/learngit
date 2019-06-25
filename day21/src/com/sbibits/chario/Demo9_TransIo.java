package com.sbibits.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo9_TransIo {
/*
 * (ʹ��ָ��������д�ַ�) 
* FileReader��ʹ��Ĭ������ȡ�ļ�, �����Ҫʹ��ָ������ȡ, ��ô����ʹ��InputStreamReader(�ֽ���,�����)
* FileWriter��ʹ��Ĭ�����д���ļ�, �����Ҫʹ��ָ�����д��, ��ô����ʹ��OutputStreamWriter(�ֽ���,�����)
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br =                                     //��Ч����ָ���ı�����
                new BufferedReader(new InputStreamReader(new FileInputStream("UTF-8.txt"), "UTF-8"));
        BufferedWriter bw =                                     //��Ч����ָ���ı����д
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream("GBK.txt"), "GBK"));
        int ch;
        while((ch = br.read()) != -1) {
            bw.write(ch);
        }
        
        br.close();
        bw.close();
    }

}
