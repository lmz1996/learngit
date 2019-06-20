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
        tm.put(new Student("张三",20), "大连");
        tm.put(new Student("李四",21), "沈阳");
        tm.put(new Student("张三",23), "大连");
        tm.put(new Student("赵五",19), "本溪");
        tm.put(new Student("赵五",19), "本溪");
        System.out.println(tm);
    }

    private static void demo1() {
        TreeMap<Student,String> tm = new TreeMap<Student,String>();
        tm.put(new Student("张三",20), "大连");
        tm.put(new Student("李四",21), "沈阳");
        tm.put(new Student("张三",23), "大连");
        tm.put(new Student("赵五",19), "本溪");
        System.out.println(tm);//需要实现comparable接口,还可以用比较器，比较器比较的是键
    }

}
