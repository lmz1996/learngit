package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8_Finally {
    /*
     * 流的标准处理异常代码1.7版本 原理
     * 在try()中创建的流对象必须实现了AutoCloseable这个接口,如果实现了,在try后面的{}(读写代码)执行后就会自动调用,
     * 流对象的close方法将流关掉 只要实现了这个接口,就会自动调用close()方法。
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (
                FileInputStream fis = new FileInputStream("aaa.txt");
                FileOutputStream fos = new FileOutputStream("ddd.txt");
             ) {
            int b;
            while((b=fis.read())!=-1){
                fos.write(b);
            }
        }
        

    }

}
