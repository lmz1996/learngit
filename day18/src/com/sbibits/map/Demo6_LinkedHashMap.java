package com.sbibits.map;

import java.util.LinkedHashMap;

public class Demo6_LinkedHashMap {
//�ײ��������ܹ���֤��ô ����ôȡ���ܱ�֤����Ψһ��
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
        lhm.put("����", 20);
        lhm.put("����", 22);
        lhm.put("����", 29);
        lhm.put("����", 27);
        lhm.put("����", 27);
        System.out.println(lhm);
    }

}
