package com.sbibits.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4_CopyPicture {
/*
 * IO��(�ַ����Ƿ���Կ����Ǵ��ı����ļ�)
* �����Կ����Ǵ��ı����ļ�,ͼƬ��Ƶ֮��Ķ����У�ͼƬ����Ƶ�����ֽ�����ɵģ���
* ��Ϊ�ڶ���ʱ��Ὣ�ֽ�ת��Ϊ�ַ�,��ת��������,�����Ҳ�����Ӧ���ַ�,�ͻ���?����,д����ʱ��Ὣ�ַ�ת�����ֽ�д��ȥ
* �����?,ֱ��д��,����д��֮����ļ�������,ͼƬ�ͻᱻ�ƻ���������  
 */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("look.jpg");
        FileWriter fw = new FileWriter("copy.jpg");
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
        fw.close();
    }

}
