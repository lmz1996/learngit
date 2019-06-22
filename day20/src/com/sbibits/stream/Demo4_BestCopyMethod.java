package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_BestCopyMethod {
//  write(byte[] b)
//  write(byte[] b, int off, int len)写出有效的字节个数
    public static void main(String[] args) throws IOException {
        /*
         * 注意:BestCopyMethod.txt现在文件中只有abc也就是3个字节,我们定义的字节数组是2个字节
         * 当第一次我们会写进数组中ab是没有问题的,现在数组中的内容是a,b
         * 但是我们第二次的时候我们的文件中未完成读取的就剩c了此时给数组赋值,数组的a 会被换成c
         * 但是b没有东西跟他替换所以此时如果write的最终结果会是abcb会发生错误
         * 正确写法看demo2
         */
//        demo1();
        FileInputStream fis = new FileInputStream("BestCopyMethod.txt");
        FileOutputStream fos = new FileOutputStream("test.txt");
        byte[] arr = new byte[1024];//小数组要是1024的整数倍
        int len;
        while((len = fis.read(arr))!=-1) {//把字节流读取到数组中
//            System.out.println(len);
            fos.write(arr, 0, len);//(数据,起始偏移量,要写入的字节数)
        }
        fis.close();
        fos.close();

    }

private static void demo1() throws FileNotFoundException, IOException {
    FileInputStream fis = new FileInputStream("BestCopyMethod.txt");
    byte[] arr = new byte[2];
    int a =fis.read(arr);//将文件上的字节读取到数组中
    System.out.println(a);
    for (byte b : arr) {
        System.out.println(b);
    }
    int c = fis.read(arr);
    System.out.println(c);
    for (byte b : arr) {
        System.out.println(b);
    }
    fis.close();
}

}
