package com.sbibits.chario;

import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {

    public static void main(String[] args) throws IOException {
//      字符流读取字符, 就要先读取到字节数据, 然后转为字符. 如果要写出字符, 需要把字符转为字节再写出.
        FileReader fr = new FileReader("ttt.txt");//创建输入流对象,关联aaa.txt
        int len;
//        字符流读取字符, 就要先读取到字节数据, 然后转为字符
        while ((len = fr.read())!=-1) {//通过默认的码表一次读取一个字符
            System.out.print((char)len);//将读到的字符强转后打印
        }
        fr.close();
    }

}
