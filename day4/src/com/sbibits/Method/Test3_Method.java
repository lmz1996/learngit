package com.sbibits.Method;

import java.util.Scanner;

public class Test3_Method {
/*
 * * A:案例演示
    * 需求：键盘录入两个数据，返回两个数中的较大值
*    B:案例演示
    * 需求：键盘录入两个数据，比较两个数是否相等 
 */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int x = sc.nextInt();
        System.out.println("请输入第二个整数");
        int y = sc.nextInt();
        int max = getMax(x, y);
        System.out.println(max);
        boolean eq = isEquals(x,y);
        System.out.println(eq);

    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static boolean isEquals(int a, int b) {
        return a == b;//如果a==b就会返回true,否则是false
    }
}
