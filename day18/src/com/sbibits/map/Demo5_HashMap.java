package com.sbibits.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sbibits.bean.Student;

public class Demo5_HashMap {
//HashMap���ϼ���Studentֵ��String�İ���
    /*
     * ����ѧ������,ֵ���ַ�����ѧ���Ĺ�����
     */
    public static void main(String[] args) {
        // ��α�֤����Ψһ,Ҫ��дhashCode��equals����
        //HashMap��д��toString����
        HashMap<Student,String> hs = new HashMap<Student,String>();
        hs.put(new Student("����",20), "����");
        hs.put(new Student("����",21), "����");
        hs.put(new Student("����",20), "����");
        hs.put(new Student("����",20), "��Ϫ");
        System.out.println(hs);
//        Set<Map.Entry<Student,String>> entrySet = hs.entrySet();
//        for (Entry<Student, String> entry : entrySet) {
//            System.out.println(entry.getKey()+"��������"+entry.getValue());
//            
//        }
    }

}
