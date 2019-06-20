package com.sbibits.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {

    public static void main(String[] args) {
//        demo_add();
//        demo_remove();
//        demo_boolean();
        Map<String, Integer> map = new HashMap<String, Integer>();
        /*d:��ȡ����
        * Set<Map.Entry<K,V>> entrySet():
        * V get(Object key):���ݼ���ȡֵ
        * Set<K> keySet():��ȡ���������м��ļ���
        * Collection<V> values():��ȡ����������ֵ�ļ���
            */
        map.put("����", 20);
        map.put("����", 22);
        map.put("����", 29);
        map.put("����", 27);
        Collection<Integer> c = map.values();
        System.out.println(c);
        //e:���ȹ���int size()�����ؼ����еļ�ֵ�Եĸ���
        System.out.println(c.size());
        
    }

    private static void demo_boolean() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        /* c:�жϹ���
        * boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
        * boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
        * boolean isEmpty()���жϼ����Ƿ�Ϊ��
            */
        map.put("����", 20);
        map.put("����", 22);
        map.put("����", 25);
        boolean a = map.containsKey("����");
        boolean b = map.containsValue(22);
        boolean c = map.isEmpty();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

private static void demo_remove() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    /*b:ɾ������
    * void clear():�Ƴ����еļ�ֵ��Ԫ��
    * V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
        */
    map.put("����", 20);
    map.put("����", 22);
    map.put("����", 25);
    Integer value = map.remove("����");
    System.out.println(value);
    System.out.println(map);
}

private static void demo_add() {
    // Map��һ���ӿ����Բ���ֱ��ʵ����,���Ը�����������ӿ�
    Map<String, Integer> map = new HashMap<String, Integer>();
    /*a:��ӹ���
    * V put(K key,V value):���Ԫ�ء�
        * ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
        * ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
        */
    Integer i = map.put("����", 20);
    Integer i1 = map.put("����", 22);
    Integer i2 = map.put("����", 25);
    System.out.println(i);
    System.out.println(i1);

    System.out.println(i2);
}

}
