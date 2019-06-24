package com.sbibits.Method;

public class Demo2_Method {
/*
 * * A:如何写一个方法
    * 1,明确返回值类型
    * 2,明确参数列表 
     B:案例演示
    * 需求：求两个数据之和的案例
    *C:方法调用图解
 */
    public static void main(String[] args) {
//        求两个数据之和的案例
//        int a = 10;
//        int b = 10;
//        int sum = a +b;
//        System.out.println(sum);
//
//        int a1 = 10;
//        int b1 = 10;
//        int sum1 = a1 +b1;
//        System.out.println(sum1);//由此可以看出如果我们不用方法的话如果还要别的数相加还要重新定义,代码的复用率太低
      //10,30是实参
        int sum = add(10,30);                  //step1:调用add方法将10,30分别传递给a,b
                                               //step5:将方法的结果返回给sum
        int sum1 = add(40,30);
        System.out.println(sum);
        System.out.println(sum1);
    }
    /*
     * 求两个整数的和
     * 1:明确返回值类型(整数的和应该还是整数那么返回值类型就是int)
     * 2:明确参数列表有两个int数
     * 3:求和
     * 4:返回
     */
    public static int add(int a, int b) {//step2:赋值a=10,b=30.a,b是形参
        int sum = a + b;           //step3:执行语句把a和b相加赋值给sum
        return sum;//step4:通过return将sum的结果返回
    }

}
