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
     * ���a.txt��b.txt��������һ���ļ���
     * ��������: SequenceInputStream(InputStream, InputStream)
     * ���϶��: SequenceInputStream(Enumeration)
     */
    public static void main(String[] args) throws IOException {
        // demo1();
        // demo2();//��������������
        // ���϶��
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        FileInputStream fis3 = new FileInputStream("e.txt");// ����3������������
        Vector<FileInputStream> ve = new Vector<>();// ����Vector���϶���
        ve.add(fis1);// �����������
        ve.add(fis2);
        ve.add(fis3);
        Enumeration<FileInputStream> en = ve.elements();// ��ȡö������
        SequenceInputStream sis = new SequenceInputStream(en);// ���ݸ�SequenceInputStream����
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
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);// ���������ϲ���һ����
        FileOutputStream fos = new FileOutputStream("d.txt");
        int a;
        while ((a = sis.read()) != -1) {
            fos.write(a);
        }
        sis.close();//sis�ڹرյ�ʱ��,�Ὣ���췽���д������Ҳ���ر�
        fos.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("c.txt");//���������c.txt���½�һ��������ڻ����
        int a;
        while ((a = fis1.read()) != -1) {
            fos.write(a);
        }
        fis1.close();
        FileInputStream fis2 = new FileInputStream("b.txt");
        int b;
        while ((b = fis2.read()) != -1) {
            fos.write(b);//������һ��������write�������,���Ǵ���ĸ�����̫��
        }
        fis2.close();
        fos.close();
    }

}
