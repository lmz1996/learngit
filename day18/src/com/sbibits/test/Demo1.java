package com.sbibits.test;

import java.util.HashMap;

public class Demo1 {
//���ַ���ת�����ַ�����
//����˫�м��ϴ洢����ֵ 
//�����ַ�����
//��������������
//�ͽ�����ֵΪ1���
//������������
//�ͽ�����ֵ�ټ�1��ӽ���
    public static void main(String[] args) {
        String s = "aaabbbbbcc";
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            hm.put(c, !hm.containsKey(c)?1:hm.get(c)+1);
        }
        System.out.println(hm);

    }

}
