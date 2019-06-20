package com.sbibits.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo_Hashtable {
/*
 * HashMap和Hashtable的区别
        * Hashtable是JDK1.0版本出现的,是线程安全的,效率低,HashMap是JDK1.2版本出现的,是线程不安全的,效率高
        * Hashtable不可以存储null键和null值,HashMap可以存储null键和null值
 */
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put(null, 11);
        hm.put("李", null);
        hm.put(null, null);
        System.out.println(hm);
        Hashtable<String, Integer> ha = new Hashtable<String, Integer>();
        ha.put(null, 1);
        ha.put("a", null);
        System.out.println(ha);

    }

}
