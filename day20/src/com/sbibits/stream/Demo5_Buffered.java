package com.sbibits.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_Buffered {
    public static void main(String[] args) throws IOException {
//        demo1();
     // �����ֽ�����������,����music.mp3
        FileInputStream fis = new FileInputStream("music.mp3");
        // ������������bis���а�װ,������һ������,һ���ܹ��洢8192���ֽ�
        BufferedInputStream bis = new BufferedInputStream(fis);
//        ���������������д��
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("music.mp3"));
        // �����ֽ����������,����copy.mp3
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        // ������������bos���а�װ,������һ������,һ���ܹ��洢8192���ֽ�
        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp3"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
            //�����Ҫʵʱˢ�»������Ļ�����������flush(),����close����(close��ֻҪװ�����Զ��ͻᴫ�� ),flush()ˢ�º�����ٴ�д��
            bos.flush();
        }
        bis.close();
        bos.close();
    }

    private static void demo1() throws FileNotFoundException, IOException {
        // �����ֽ�����������,����music.mp3
        FileInputStream fis = new FileInputStream("music.mp3");
        // ������������bis���а�װ,������һ������,һ���ܹ��洢8192���ֽ�
        BufferedInputStream bis = new BufferedInputStream(fis);
        // �����ֽ����������,����copy.mp3
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        // ������������bos���а�װ,������һ������,һ���ܹ��洢8192���ֽ�
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
      //ֻ��װ�κ�Ķ��󼴿ɣ���װ���),�����൱��һ��������ױ����ѻ�ױʱ������ɵ����ǲ��Ǿ��ǰ����ɵ��ˣ����ÿ���û��ױ����
        bis.close();
        bos.close();
    }
}
