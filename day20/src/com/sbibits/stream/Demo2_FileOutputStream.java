package com.sbibits.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

    public static void main(String[] args) throws IOException {
        // demo1();//����һ���µ�
//        demo2();//ԭ�еĻ�����׷��
        
    }

    private static void demo1() throws FileNotFoundException, IOException {
        // ����һ���ֽ������,����ļ���������ᰴ��·������һ���ļ�,����оͻὫ�ļ��������
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        // ��Ȼд������һ��int��,���ǵ��ļ�����һ���ֽ�,���Զ�Ĩ��ǰ��λ
        // ������yyy.txt�ļ��Ҽ�propertis�Ͽ�,size��3bytes
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }

    private static void demo2() throws FileNotFoundException, IOException {
        // ����һ���ֽ������,����ļ���������ᰴ��·������һ���ļ�,����оͻὫ�ļ��������
        // �����Ҫ����֮ǰ�����ݼ���,��ô��Ҫ�ڵڶ���������дtrue
        //FileOutputStream(File file, boolean append)
        FileOutputStream fos = new FileOutputStream("yyy.txt", true);
        // fos.write(100);//��ʱԭ���ļ��е������Ѿ��������,����write
        fos.write(103);
        fos.close();
    }

}
