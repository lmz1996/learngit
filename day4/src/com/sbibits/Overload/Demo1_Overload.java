package com.sbibits.Overload;

public class Demo1_Overload {
/*
 * * A:方法重载概述
    * 求和案例
        * 2个整数
        * 3个整数
        * 4个整数
* B:方法重载：
    * 在同一个类中，方法名相同，参数列表不同。与返回值类型无关。
    
    * 参数列表不同：
        * A:参数个数不同
        * B:参数类型不同
        * C:参数的顺序不同(算重载,但是在开发中不用)
 */
    public static void main(String[] args) {
        double sum = add(1, 3, 5);
        int sum1 = add(1, 5);
        int sum2 = add(3, 4, 5, 6);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(int a, int b,int c) {//与返回值类型无关。你可以把int改成double并不会报错只是类型自动提升了
        return a + b +c;
    }
    public static int add(int a, int b, int c, int d) {
        return a + b +c +d;
    }
}
