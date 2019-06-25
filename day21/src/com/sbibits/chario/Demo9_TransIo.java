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
 * (使用指定的码表读写字符) 
* FileReader是使用默认码表读取文件, 如果需要使用指定码表读取, 那么可以使用InputStreamReader(字节流,编码表)
* FileWriter是使用默认码表写出文件, 如果需要使用指定码表写出, 那么可以使用OutputStreamWriter(字节流,编码表)
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br =                                     //高效的用指定的编码表读
                new BufferedReader(new InputStreamReader(new FileInputStream("UTF-8.txt"), "UTF-8"));
        BufferedWriter bw =                                     //高效的用指定的编码表写
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream("GBK.txt"), "GBK"));
        int ch;
        while((ch = br.read()) != -1) {
            bw.write(ch);
        }
        
        br.close();
        bw.close();
    }

}
