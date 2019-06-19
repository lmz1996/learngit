package day16;

import java.util.ArrayList;

public class Demo9 {
    /*
     * A:增强for概述 简化数组和Collection集合的遍历 B:格式：
     * 
     * for(元素数据类型 变量 : 数组或者Collection集合) { 使用变量即可，该变量就是元素 } C:案例演示
     * 数组，集合存储元素用增强for遍历 D:好处 简化遍历
     */
    public static void main(String[] args) {
        // demo1();
        // demo2();
        demo3();

    }

    private static void demo3() {
        // 自定义对象
        ArrayList<Person> arrList = new ArrayList<Person>();
        arrList.add(new Person("张三", 20));
        arrList.add(new Person("赵四", 21));
        for (Person person : arrList) {
            System.out.println(person);
        }
    }

    private static void demo2() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("張三");
        arrList.add("趙四");
        for (String string : arrList) {
            System.out.println(string);
        }
    }

    private static void demo1() {
        int[] arr = { 1, 3, 5, 7 };
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
