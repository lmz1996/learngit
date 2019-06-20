package com.sbibits.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1_Collections {
/*
 * public static <T> void sort(List<T> list)
        public static <T> int binarySearch(List<?> list,T key)二分查找法
        public static <T> T max(Collection<?> coll)
        public static void reverse(List<?> list)
        public static void shuffle(List<?> list)
 */
    public static void main(String[] args) {
        //1:list的排序
//        demo1();
        //2:二分法查询
//        demo2();
        //3:max,根据默认的排序结果获取集合中的最大值
//        demo3();
        //4:reverse反转
//        demo4();
        //5:随机置换,可以用来洗牌
        List<String> list = new ArrayList<String>();
        list.add("w");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("e");
        Collections.shuffle(list);
        System.out.println(list);
    }

private static void demo4() {
    List<String> list = new ArrayList<String>();
    list.add("w");
    list.add("b");
    list.add("c");
    list.add("a");
    list.add("e");
    Collections.reverse(list);
    System.out.println(list);
}

    private static void demo3() {
        List<String> list = new ArrayList<String>();
        list.add("w");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("e");
       System.out.println(Collections.max(list));
    }

    private static void demo2() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //如果搜索键包含在列表中,则返回索引。如果没有则返回-(插入点)-1;
        System.out.println(Collections.binarySearch(list, "c"));
        System.out.println(Collections.binarySearch(list, "w"));
    }

private static void demo1() {
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("c");
    list.add("e");
    list.add("g");
    list.add("b");
    Collections.sort(list);
    System.out.println(list);
}

}
