package com.sbibits.stream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ�����ȡ���ĵ�����
    * �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,������� 
* �ֽ���д�����ĵ�����
    * �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� 
    * д���س����� write("\r\n".getBytes());
 */
public class Demo6_Chinese {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("se.txt");
        fos.write("���ô�Һܺ�".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("����˭".getBytes());
        fos.close();
    }
}
