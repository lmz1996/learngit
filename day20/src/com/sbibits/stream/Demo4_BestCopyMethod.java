package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_BestCopyMethod {
//  write(byte[] b)
//  write(byte[] b, int off, int len)д����Ч���ֽڸ���
    public static void main(String[] args) throws IOException {
        /*
         * ע��:BestCopyMethod.txt�����ļ���ֻ��abcҲ����3���ֽ�,���Ƕ�����ֽ�������2���ֽ�
         * ����һ�����ǻ�д��������ab��û�������,���������е�������a,b
         * �������ǵڶ��ε�ʱ�����ǵ��ļ���δ��ɶ�ȡ�ľ�ʣc�˴�ʱ�����鸳ֵ,�����a �ᱻ����c
         * ����bû�ж��������滻���Դ�ʱ���write�����ս������abcb�ᷢ������
         * ��ȷд����demo2
         */
//        demo1();
        FileInputStream fis = new FileInputStream("BestCopyMethod.txt");
        FileOutputStream fos = new FileOutputStream("test.txt");
        byte[] arr = new byte[1024];//С����Ҫ��1024��������
        int len;
        while((len = fis.read(arr))!=-1) {//���ֽ�����ȡ��������
//            System.out.println(len);
            fos.write(arr, 0, len);//(����,��ʼƫ����,Ҫд����ֽ���)
        }
        fis.close();
        fos.close();

    }

private static void demo1() throws FileNotFoundException, IOException {
    FileInputStream fis = new FileInputStream("BestCopyMethod.txt");
    byte[] arr = new byte[2];
    int a =fis.read(arr);//���ļ��ϵ��ֽڶ�ȡ��������
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
