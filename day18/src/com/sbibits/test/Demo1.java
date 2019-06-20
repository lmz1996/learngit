package com.sbibits.test;

import java.util.HashMap;

public class Demo1 {
//将字符串转换成字符数组
//创建双列集合存储键和值 
//遍历字符数组
//如果不包含这个键
//就将键和值为1添加
//如果包含这个键
//就将键和值再加1添加进来
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
