package com.sbibits.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {
    public static void main(String[] args) throws IOException {
//        copy_picture();
//        copy_mp3();//��һ��copy��ʽ̫�����Ƽ�ʹ��
        /*
         * ��Ҫcopy���ļ���΢����ʱ��һ���ֽ�һ���ֽڵ�read��write�����
         * �ж��ٸ��ֽھ�Ҫread���ٴλ�Ҫ����write�Ĵ���Ч���ر��
         * ����Ϊ�˽���������������һ����������Щ�ֽ���װ����һ����
         * ���ǿ��԰����е��ֽڷŵ�һ��������Ȼ����������ȫ��write���ļ���
         * �׶�:�п��ܻ��ڴ���� 
         * ����:��Ȼ�ٶȺܿ쵫���ڿ����в��Ƽ���ô��,��Ϊ���һ����Ӱ�ļ�5��G��ô�ͻᴴ��һ��
         * 5��G���ֽ�����,���ǵ�����������������ǵ��ڴ���Ҳ��170MB��������˸�5��G�ľͻ�����ڴ����
         */
//     copy_allsend();//�ڶ��ַ�ʽ���Ƽ�ʹ���п��ܻᵼ���ڴ����
    }

    private static void copy_allsend() throws FileNotFoundException, IOException {
        // �����������������music.mp3
            FileInputStream fis = new FileInputStream("music.mp3");
            // �������������,������copy.mp3���û���Զ�����
            FileOutputStream fos = new FileOutputStream("copy.mp3");
//        int len = fis.available();//��ȡ���е��ֽ���
            byte[] arr = new byte[fis.available()];
            fis.read(arr);//���ļ��ϵ��ֽڶ�ȡ���ڴ���Ҳ�������������
            fos.write(arr);//���ֽ������е��ֽ�����ȫ��д���ļ���
            fis.close();
            fos.close();
    }

    private static void copy_mp3() throws FileNotFoundException, IOException {
        // �����������������music.mp3
            FileInputStream fis = new FileInputStream("music.mp3");
            // �������������,������copy.mp3���û���Զ�����
            FileOutputStream fos = new FileOutputStream("copy.mp3");
            int b;
            // ���ϵض�ȡÿһ���ֽ�
            while ((b = fis.read()) != -1) {
                // ��ÿһ���ֽ�д��
                fos.write(b);
            }
            // �ر�IO��
            fis.close();
            fos.close();
    }

    private static void copy_picture() throws FileNotFoundException, IOException {
        // �����������������look.jpg
        FileInputStream fis = new FileInputStream("look.jpg");
        // �������������,������copy.jpg���û���Զ�����
        FileOutputStream fos = new FileOutputStream("copy.jpg");
        int b;
        // ���ϵض�ȡÿһ���ֽ�
        while ((b = fis.read()) != -1) {
            // ��ÿһ���ֽ�д��
            fos.write(b);
        }
        // �ر�IO��
        fis.close();
        fos.close();
    }

}
