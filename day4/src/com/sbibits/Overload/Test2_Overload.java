package com.sbibits.Overload;

public class Test2_Overload {
/*
 * ���󣺱Ƚ����������Ƿ���ȡ�
    * �������ͷֱ�Ϊ����int���ͣ�����double���ͣ�����main�����н��в���
 */
    public static void main(String[] args) {
        boolean com1 = isEquals(10, 10);
        System.out.println(com1);
        boolean com3 = isEquals(10.3, 10.3);
        System.out.println(com3);
    }

    public static boolean isEquals(int a,int b) {
        return a == b;
    }
    public static boolean isEquals(double a,double b) {
        return a == b;
    }
}
