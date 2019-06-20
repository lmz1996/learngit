package com.sbibits.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4_Exception {

    public static void main(String[] args) throws FileNotFoundException {
        // 1:会发生编译期异常(未雨绸缪异常),因为并不确定会不会发生错误,有可能出现问题。比如找不到文件
        // 此时可以try catch或抛出异常,像流这种的一般抛出
        FileInputStream file = new FileInputStream("ttt.txt");

    }

}
