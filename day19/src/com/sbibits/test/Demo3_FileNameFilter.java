package com.sbibits.test;

import java.io.File;
import java.io.FilenameFilter;

public class Demo3_FileNameFilter {
    /*
     * A:�ļ����ƹ������ĸ��� public String[] list(FilenameFilter filter) public File[]
     * listFiles(FileFilter filter) B:�ļ����ƹ�������ʹ��
     * �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ����� C:Դ����� ���ļ����ƹ�������list()������Դ��
     */
    public static void main(String[] args) {
        File dir = new File("E:\\");
        String[] arr = dir.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                return file.isFile() && file.getName().endsWith(".JPG");
            }

        });
        for (String string : arr) {
            System.out.println(string);
        }
    }

}
