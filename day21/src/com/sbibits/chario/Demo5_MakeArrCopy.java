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
        while ((len = fr.read(arr)) != -1) {//将文件上的数据读取到字符数组里
            fw.write(arr, 0, len);//将字符数组中的数组写到文件上
        }
        fr.close();
        fw.close();
    }

}
