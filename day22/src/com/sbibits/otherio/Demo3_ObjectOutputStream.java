package com.sbibits.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sbibits.bean.Person;

public class Demo3_ObjectOutputStream {
/*
 * 1.ʲô�Ƕ��������
    * �������Խ�һ������д��, ���߶�ȡһ�����󵽳�����. Ҳ����ִ�������л��ͷ����л��Ĳ���.
    * ���л�:������д���ļ���
 */
    public static void main(String[] args) throws IOException, IOException {
        //����һ��Person����
        Person p1 = new Person("����",23);
        Person p2 = new Person("����",24);
      //�������ֽ������,�����ַ������������ֱ��д������
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("t.txt"));//�������������
        //�൱�ڰѶ���ת�����ַ�����,�������ǵ��ļ��л��������,����û����ֻҪ���Ƕ��ļ����ܹ���������
        //�൱�����Ǵ���Ϸ�浵���Ǵ浵�󲢲��ῴ������ʲôװ��֮���,ֻ��������һ�δ���Ϸʱ�Żῴ��
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.close();
    }

}
