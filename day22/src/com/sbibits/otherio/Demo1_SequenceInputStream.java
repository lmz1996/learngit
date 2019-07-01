package com.sbibits.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo1_SequenceInputStream {
    /*
     * 想把a.txt和b.txt都给插入一个文件中
     * 整合两个: SequenceInputStream(InputStream, InputStream)
     * 整合多个: SequenceInputStream(Enumeration)
     */
    public static void main(String[] args) throws IOException {
        // demo1();
        // demo2();//序列流整合两个
        // 整合多个
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        FileInputStream fis3 = new FileInputStream("e.txt");// 创建3个输入流对象
        Vector<FileInputStream> ve = new Vector<>();// 创建Vector集合对象
        ve.add(fis1);// 将流对象添加
        ve.add(fis2);
        ve.add(fis3);
        Enumeration<FileInputStream> en = ve.elements();// 获取枚举引用
        SequenceInputStream sis = new SequenceInputStream(en);// 传递给SequenceInputStream构造
        FileOutputStream fos = new FileOutputStream("g.txt");
        int a;
        while ((a = sis.read()) != -1) {
            fos.write(a);
        }
        sis.close();
        fos.close();

    }

    private static void demo2() throws FileNotFoundException, IOException {
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);// 将两个流合并成一个流
        FileOutputStream fos = new FileOutputStream("d.txt");
        int a;
        while ((a = sis.read()) != -1) {
            fos.write(a);
        }
        sis.close();//sis在关闭的时候,会将构造方法中传入的流也都关闭
        fos.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("c.txt");//如果不存在c.txt会新建一个如果存在会清空
        int a;
        while ((a = fis1.read()) != -1) {
            fos.write(a);
        }
        fis1.close();
        FileInputStream fis2 = new FileInputStream("b.txt");
        int b;
        while ((b = fis2.read()) != -1) {
            fos.write(b);//接着上一个流继续write不会清空,但是代码的复用性太差
        }
        fis2.close();
        fos.close();
    }

}
