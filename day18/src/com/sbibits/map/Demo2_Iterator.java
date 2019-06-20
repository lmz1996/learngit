package com.sbibits.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {
/*
 * 通过查看map集合的API发现没有Iterator,那么双列集合怎么迭代？
 * d:获取功能
        * Set<Map.Entry<K,V>> entrySet():
        * V get(Object key):根据键获取值
        * Set<K> keySet():获取集合中所有键的集合
 */
    public static void main(String[] args) {
        //我们可以通过键来得到相应的值，那么只要我们获取所有的键那么就能遍历
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("张三", 20);
        map.put("李四", 22);
        map.put("张六", 29);
        map.put("赵六", 27);
        //1:使用迭代器遍历
        //demo1(map);
        //2:使用争强for循环
        demo2(map);
    }

    private static void demo2(Map<String, Integer> map) {
        for (String key : map.keySet()) {//map.keySet()获取所有的key
            System.out.println(key+"..."+map.get(key));
            
        }
    }

    private static void demo1(Map<String, Integer> map) {
        Set<String> keySet = map.keySet();//获取所有键的集合
        //拿到了所有的键就能获取value
        Iterator<String> it = keySet.iterator();//获取迭代器
        while(it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"..."+value);
        }
    }

}
