package com.sbibits.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.sbibits.bean.Person;

/*
 * ObjectInputStream对象输入流,当文件读取到了末尾时会出现EOFException
* 读取: new ObjectInputStream(InputStream), readObject()
* 读取对象,反序列化,相当于打开存档
 */
public class Demo4_ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t.txt"));
        Person p1 = (Person) ois.readObject();
        Person p2 = (Person) ois.readObject();
        // Person p3 = (Person)
        // ois.readObject();//ObjectInputStream对象输入流,当文件读取到了末尾时会出现EOFException
        System.out.println(p1);
        System.out.println(p2);
    }
}
