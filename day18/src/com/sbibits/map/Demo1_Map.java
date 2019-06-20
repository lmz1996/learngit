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
        /*d:获取功能
        * Set<Map.Entry<K,V>> entrySet():
        * V get(Object key):根据键获取值
        * Set<K> keySet():获取集合中所有键的集合
        * Collection<V> values():获取集合中所有值的集合
            */
        map.put("张三", 20);
        map.put("李四", 22);
        map.put("张六", 29);
        map.put("赵六", 27);
        Collection<Integer> c = map.values();
        System.out.println(c);
        //e:长度功能int size()：返回集合中的键值对的个数
        System.out.println(c.size());
        
    }

    private static void demo_boolean() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        /* c:判断功能
        * boolean containsKey(Object key)：判断集合是否包含指定的键
        * boolean containsValue(Object value):判断集合是否包含指定的值
        * boolean isEmpty()：判断集合是否为空
            */
        map.put("张三", 20);
        map.put("李四", 22);
        map.put("张六", 25);
        boolean a = map.containsKey("张三");
        boolean b = map.containsValue(22);
        boolean c = map.isEmpty();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

private static void demo_remove() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    /*b:删除功能
    * void clear():移除所有的键值对元素
    * V remove(Object key)：根据键删除键值对元素，并把值返回
        */
    map.put("张三", 20);
    map.put("李四", 22);
    map.put("张六", 25);
    Integer value = map.remove("李四");
    System.out.println(value);
    System.out.println(map);
}

private static void demo_add() {
    // Map是一个接口所以不能直接实例化,所以父类引用子类接口
    Map<String, Integer> map = new HashMap<String, Integer>();
    /*a:添加功能
    * V put(K key,V value):添加元素。
        * 如果键是第一次存储，就直接存储元素，返回null
        * 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
        */
    Integer i = map.put("张三", 20);
    Integer i1 = map.put("李四", 22);
    Integer i2 = map.put("张三", 25);
    System.out.println(i);
    System.out.println(i1);

    System.out.println(i2);
}

}
