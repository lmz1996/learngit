package com.sbibits.Method;

import java.util.Scanner;

public class Test3_Method {
/*
 * * A:������ʾ
    * ���󣺼���¼���������ݣ������������еĽϴ�ֵ
*    B:������ʾ
    * ���󣺼���¼���������ݣ��Ƚ��������Ƿ���� 
 */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("�������һ������:");
        int x = sc.nextInt();
        System.out.println("������ڶ�������");
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
        return a == b;//���a==b�ͻ᷵��true,������false
    }
}
