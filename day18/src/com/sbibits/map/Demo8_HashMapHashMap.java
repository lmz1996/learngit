package com.sbibits.map;

import java.util.HashMap;

import com.sbibits.bean.Student;

public class Demo8_HashMapHashMap {
//����Ƕ��֮HashMapǶ��HashMap
    public static void main(String[] args) {
        HashMap<Student,String> hs88 = new HashMap<Student,String>();
        hs88.put(new Student("����",20), "����");
        hs88.put(new Student("����",21), "����");
        hs88.put(new Student("����",20), "����");
        hs88.put(new Student("����",20), "��Ϫ");
        
        HashMap<Student,String> hs99 = new HashMap<Student,String>();
        hs99.put(new Student("����",70), "����");
        hs99.put(new Student("�ŷ�",71), "����");
        hs99.put(new Student("����",65), "����");
        hs99.put(new Student("����",65), "��Ϫ");
            //�����ѧУ
        HashMap<HashMap<Student,String>,String> hs = new HashMap<HashMap<Student,String>,String>();
        hs.put(hs88, "ǹ�ڰ༶");
        hs.put(hs99, "�����");
        System.out.println(hs);

        for(HashMap<Student,String> h:hs.keySet()){//hs.keySet()��ȡ˫�м����еļ�����
            String value = hs.get(h);
            for(Student key :h.keySet()){//��ȡ���е�ѧ��������
                String  value2 = h.get(key);
                System.out.println(key+"="+value2+"="+value);
            }
            
        }

    }

}
