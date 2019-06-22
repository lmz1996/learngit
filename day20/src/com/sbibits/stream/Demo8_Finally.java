package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8_Finally {
    /*
     * ���ı�׼�����쳣����1.7�汾 ԭ��
     * ��try()�д��������������ʵ����AutoCloseable����ӿ�,���ʵ����,��try�����{}(��д����)ִ�к�ͻ��Զ�����,
     * �������close���������ص� ֻҪʵ��������ӿ�,�ͻ��Զ�����close()������
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
