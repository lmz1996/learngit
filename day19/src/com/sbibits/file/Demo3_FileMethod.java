package com.sbibits.file;

import java.io.File;

public class Demo3_FileMethod {

    public static void main(String[] args) {
        /*
         * * A:重命名和删除功能
            * public boolean renameTo(File dest):把文件重命名为指定的文件路径
            * public boolean delete():删除文件或者文件夹
            * B:重命名注意事项
                * 如果路径名相同，就是改名。
                * 如果路径名不同，就是改名并剪切。
            * C:删除注意事项：
                * Java中的删除不走回收站。
                * 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
         */
//        demo1();
        demo2();
    }

    private static void demo2() {
        File file = new File("ddww.txt");
        System.out.println(file.delete());

        File file1 = new File("sss");
        //要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
        //如果想要删除待带内容的需要遍历删除文件然后删除文件夹
        System.out.println(file1.delete());
    }

    private static void demo1() {
        File file = new File("yyy.md");
        File file1 = new File("ddww.txt");
        System.out.println(file.renameTo(file1));
        
        File file2 = new File("aaa.txt");
        File file3 = new File("D:\\ddww.txt");
        file2.renameTo(file3);
    }

}
