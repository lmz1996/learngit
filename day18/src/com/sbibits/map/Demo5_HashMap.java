package com.sbibits.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sbibits.bean.Student;

public class Demo5_HashMap {
//HashMap集合键是Student值是String的案例
    /*
     * 键是学生对象,值是字符串是学生的归属地
     */
    public static void main(String[] args) {
        // 如何保证键的唯一,要重写hashCode和equals方法
        //HashMap重写了toString方法
        HashMap<Student,String> hs = new HashMap<Student,String>();
        hs.put(new Student("张三",20), "大连");
        hs.put(new Student("李四",21), "沈阳");
        hs.put(new Student("张三",20), "大连");
        hs.put(new Student("赵五",20), "本溪");
        System.out.println(hs);
//        Set<Map.Entry<Student,String>> entrySet = hs.entrySet();
//        for (Entry<Student, String> entry : entrySet) {
//            System.out.println(entry.getKey()+"归属地是"+entry.getValue());
//            
//        }
    }

}
