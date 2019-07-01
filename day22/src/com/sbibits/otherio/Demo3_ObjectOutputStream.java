package com.sbibits.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sbibits.bean.Person;

public class Demo3_ObjectOutputStream {
/*
 * 1.什么是对象操作流
    * 该流可以将一个对象写出, 或者读取一个对象到程序中. 也就是执行了序列化和反序列化的操作.
    * 序列化:将对象写到文件上
 */
    public static void main(String[] args) throws IOException, IOException {
        //创建一个Person对象
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",24);
      //无论是字节输出流,还是字符输出流都不能直接写出对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("t.txt"));//创建对象输出流
        //相当于把对象转换成字符数组,但是我们的文件中会出现乱码,但是没问题只要我们读文件是能够正常就行
        //相当于我们打游戏存档我们存档后并不会看我现在什么装备之类的,只有我们下一次打游戏时才会看他
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.close();
    }

}
