package com.sbibits.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo7_BufferedReadLine {
/*
 * 带缓冲区的字符流中的特殊方法
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("readLine.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("www.txt"));
        String line;
//        BufferedReader的readLine()方法可以读取一行字符(不包含换行符号)
        while ((line = br.readLine()) != null) {
            bw.write(line);
//            BufferedWriter的newLine()可以输出一个跨平台的换行符号"\r\n"
            bw.newLine();//如果不加输出会全在一行
//            bw.write("\r\n");
            /*
             * newLine()与\r\n的区别
             * newLine()是跨平台的方法
             * \r\n只能用于wondows
             */
        }
        br.close();
        bw.close();

    }

}
