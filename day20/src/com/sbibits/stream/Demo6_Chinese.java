package com.sbibits.stream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节流读取中文的问题
    * 字节流在读中文的时候有可能会读到半个中文,造成乱码 
* 字节流写出中文的问题
    * 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
    * 写出回车换行 write("\r\n".getBytes());
 */
public class Demo6_Chinese {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("se.txt");
        fos.write("你好么我很好".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("我是谁".getBytes());
        fos.close();
    }
}
