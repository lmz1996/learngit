package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {
/*
 * Ϊʲôread����һ���ֽ���int������byte��
 * 1:�ᱨ��,��Ϊint��ֵ��byte����ʧ����
 * 2:��ΪFileInputStream���ֽ�����ȡ,���Զ�ȡ�κ��ļ�.��Ƶ��Ƶ���Ǳ���Ҫ�н������-1
 * ������ص���byteÿ�ζ�ȡ����һ��8λ   00001111 00000000 11111111����11111111ʱ�����
 * 11111111����һ��byte���͵�-1
 * 10000001��byte����-1��ԭ��,����ʱ�Բ�������
 * 11111110 -1�ķ���
 * 11111111 ��-1�Ĳ��������ӵĻ�11111111����-1��ô��Ĭ�϶�����û�취����
 */
    public static void main(String[] args) throws IOException {
        // demo1();
        FileInputStream fis = new FileInputStream("aaa.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
        }
        // �ر����ͷ���Դ
        fis.close();
    }

    private static void demo1() throws FileNotFoundException, IOException {
        // ����һ���ֽ�����������,aaa.txt�����·�������ڱ�������
        FileInputStream fis = new FileInputStream("aaa.txt");
        // һ�ζ�ȡһ���ֽ�,ÿreadһ���൱��ָ�����������һλ��
        int x = fis.read();
        System.out.println(x);
        int y = fis.read();
        System.out.println(y);
        int z = fis.read();
        System.out.println(z);
        // �������-1����ô˵���ļ������ˡ�-1���ļ��Ľ������,Ҳ����һ���ļ��Ľ�������
        int e = fis.read();
        System.out.println(e);
        // �ر����ͷ���Դ
        fis.close();
    }

}
