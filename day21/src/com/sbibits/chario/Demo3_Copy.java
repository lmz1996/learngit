package com.sbibits.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ttt.txt");
        // 创建一个输出流对象与aaa.txt相关联,如果不存在会自动建立
        FileWriter fw = new FileWriter("aaa.txt");
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
//        writer类中有一个1024个字符的缓冲区,也就是2048个字节,如果不关流内容就会停留在
//        缓冲区中,关闭流会将缓冲区内容刷新再关闭
//        fw.close();
        fw.close();
    }

}
