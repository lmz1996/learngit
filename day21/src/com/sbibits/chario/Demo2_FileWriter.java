package com.sbibits.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

    public static void main(String[] args) throws IOException {
        //创建一个输出流对象与yyy.txt相关联
        FileWriter fw = new FileWriter("yyy.txt");
//        如果要写出字符, 需要把字符转为字节再写出.最后编码表将字节翻译成文字否则就是0101的数字了
        fw.write("我们的java基础已经接近尾声了,大家加油");
        fw.close();

    }

}
