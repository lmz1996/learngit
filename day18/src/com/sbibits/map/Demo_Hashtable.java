package com.sbibits.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo_Hashtable {
/*
 * HashMap��Hashtable������
        * Hashtable��JDK1.0�汾���ֵ�,���̰߳�ȫ��,Ч�ʵ�,HashMap��JDK1.2�汾���ֵ�,���̲߳���ȫ��,Ч�ʸ�
        * Hashtable�����Դ洢null����nullֵ,HashMap���Դ洢null����nullֵ
 */
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put(null, 11);
        hm.put("��", null);
        hm.put(null, null);
        System.out.println(hm);
        Hashtable<String, Integer> ha = new Hashtable<String, Integer>();
        ha.put(null, 1);
        ha.put("a", null);
        System.out.println(ha);

    }

}
