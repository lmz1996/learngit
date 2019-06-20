package com.sbibits.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.sbibits.bean.Student;

public class Demo7_TreeMap {

    public static void main(String[] args) {
//        demo1();
        TreeMap<Student,String> tm = new TreeMap<Student,String>(new Comparator<Student>() {

            @Override 
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? o1.getName().compareTo(o2.getName()):num;
            }
        });
        tm.put(new Student("����",20), "����");
        tm.put(new Student("����",21), "����");
        tm.put(new Student("����",23), "����");
        tm.put(new Student("����",19), "��Ϫ");
        tm.put(new Student("����",19), "��Ϫ");
        System.out.println(tm);
    }

    private static void demo1() {
        TreeMap<Student,String> tm = new TreeMap<Student,String>();
        tm.put(new Student("����",20), "����");
        tm.put(new Student("����",21), "����");
        tm.put(new Student("����",23), "����");
        tm.put(new Student("����",19), "��Ϫ");
        System.out.println(tm);//��Ҫʵ��comparable�ӿ�,�������ñȽ������Ƚ����Ƚϵ��Ǽ�
    }

}
