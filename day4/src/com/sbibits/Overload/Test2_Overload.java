package com.sbibits.Overload;

public class Test2_Overload {
/*
 * 需求：比较两个数据是否相等。
    * 参数类型分别为两个int类型，两个double类型，并在main方法中进行测试
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
