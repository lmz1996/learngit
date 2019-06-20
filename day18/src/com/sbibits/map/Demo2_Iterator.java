package com.sbibits.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {
/*
 * ͨ���鿴map���ϵ�API����û��Iterator,��ô˫�м�����ô������
 * d:��ȡ����
        * Set<Map.Entry<K,V>> entrySet():
        * V get(Object key):���ݼ���ȡֵ
        * Set<K> keySet():��ȡ���������м��ļ���
 */
    public static void main(String[] args) {
        //���ǿ���ͨ�������õ���Ӧ��ֵ����ôֻҪ���ǻ�ȡ���еļ���ô���ܱ���
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("����", 20);
        map.put("����", 22);
        map.put("����", 29);
        map.put("����", 27);
        //1:ʹ�õ���������
        //demo1(map);
        //2:ʹ����ǿforѭ��
        demo2(map);
    }

    private static void demo2(Map<String, Integer> map) {
        for (String key : map.keySet()) {//map.keySet()��ȡ���е�key
            System.out.println(key+"..."+map.get(key));
            
        }
    }

    private static void demo1(Map<String, Integer> map) {
        Set<String> keySet = map.keySet();//��ȡ���м��ļ���
        //�õ������еļ����ܻ�ȡvalue
        Iterator<String> it = keySet.iterator();//��ȡ������
        while(it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"..."+value);
        }
    }

}
