package com.sbibits.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.sbibits.bean.Person;

/*
 * ObjectInputStream����������,���ļ���ȡ����ĩβʱ�����EOFException
* ��ȡ: new ObjectInputStream(InputStream), readObject()
* ��ȡ����,�����л�,�൱�ڴ򿪴浵
 */
public class Demo4_ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t.txt"));
        Person p1 = (Person) ois.readObject();
        Person p2 = (Person) ois.readObject();
        // Person p3 = (Person)
        // ois.readObject();//ObjectInputStream����������,���ļ���ȡ����ĩβʱ�����EOFException
        System.out.println(p1);
        System.out.println(p2);
    }
}
