package com.sbibits.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1_Collections {
/*
 * public static <T> void sort(List<T> list)
        public static <T> int binarySearch(List<?> list,T key)���ֲ��ҷ�
        public static <T> T max(Collection<?> coll)
        public static void reverse(List<?> list)
        public static void shuffle(List<?> list)
 */
    public static void main(String[] args) {
        //1:list������
//        demo1();
        //2:���ַ���ѯ
//        demo2();
        //3:max,����Ĭ�ϵ���������ȡ�����е����ֵ
//        demo3();
        //4:reverse��ת
//        demo4();
        //5:����û�,��������ϴ��
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
        //����������������б���,�򷵻����������û���򷵻�-(�����)-1;
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
