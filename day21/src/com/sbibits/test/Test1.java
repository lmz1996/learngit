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
//将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
/*
 * 分析:
 * 1:创建流对象
 * 2:创建集合对象
 * 3:将读到的数据存储到集合中
 * 4:倒着遍历集合将数据写到文件上
 * 5:关流
 */
    public static void main(String[] args) throws IOException {
        //注意事项:流对象尽量晚开早关
        //1:创建流对象
        BufferedReader br = new BufferedReader(new FileReader("readLine.txt"));
        //2:创建集合对象
        List<String> list = new ArrayList<String>();

        //3:将读到的数据存储到集合中
        String readLine;
        while ((readLine = br.readLine()) != null) {
            list.add(readLine);
        }
        br.close();//流对象尽量晚开早关
        BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
      //4:倒着遍历集合将数据写到文件上
        for (int i = list.size() -1;i>=0;i--) {
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.close();
    }

}
