package com.sbibits.map;

import java.util.HashMap;

import com.sbibits.bean.Student;

public class Demo8_HashMapHashMap {
//集合嵌套之HashMap嵌套HashMap
    public static void main(String[] args) {
        HashMap<Student,String> hs88 = new HashMap<Student,String>();
        hs88.put(new Student("张三",20), "大连");
        hs88.put(new Student("李四",21), "沈阳");
        hs88.put(new Student("张三",20), "大连");
        hs88.put(new Student("赵五",20), "本溪");
        
        HashMap<Student,String> hs99 = new HashMap<Student,String>();
        hs99.put(new Student("赵云",70), "大连");
        hs99.put(new Student("张飞",71), "沈阳");
        hs99.put(new Student("关羽",65), "大连");
        hs99.put(new Student("吕布",65), "本溪");
            //定义格斗学校
        HashMap<HashMap<Student,String>,String> hs = new HashMap<HashMap<Student,String>,String>();
        hs.put(hs88, "枪炮班级");
        hs.put(hs99, "冷兵器");
        System.out.println(hs);

        for(HashMap<Student,String> h:hs.keySet()){//hs.keySet()获取双列集合中的键对象
            String value = hs.get(h);
            for(Student key :h.keySet()){//获取所有的学生键对象
                String  value2 = h.get(key);
                System.out.println(key+"="+value2+"="+value);
            }
            
        }

    }

}
