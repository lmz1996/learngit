package com.sbibits.Overload;

public class Demo1_Overload {
/*
 * * A:�������ظ���
    * ��Ͱ���
        * 2������
        * 3������
        * 4������
* B:�������أ�
    * ��ͬһ�����У���������ͬ�������б�ͬ���뷵��ֵ�����޹ء�
    
    * �����б�ͬ��
        * A:����������ͬ
        * B:�������Ͳ�ͬ
        * C:������˳��ͬ(������,�����ڿ����в���)
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
    public static double add(int a, int b,int c) {//�뷵��ֵ�����޹ء�����԰�int�ĳ�double�����ᱨ��ֻ�������Զ�������
        return a + b +c;
    }
    public static int add(int a, int b, int c, int d) {
        return a + b +c +d;
    }
}
