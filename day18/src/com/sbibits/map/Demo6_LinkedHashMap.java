package com.sbibits.map;

import java.util.LinkedHashMap;

public class Demo6_LinkedHashMap {
//底层是链表能够保证怎么 存怎么取还能保证键的唯一性
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
        lhm.put("张三", 20);
        lhm.put("李四", 22);
        lhm.put("张六", 29);
        lhm.put("赵六", 27);
        lhm.put("赵六", 27);
        System.out.println(lhm);
    }

}
