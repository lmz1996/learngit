package com.sbibits.exception;

public class Demo6_Throwable {
    /*A:Throwable的几个常见方法
    * a:getMessage()
        * 获取异常信息，返回字符串。
    * b:toString()
        * 获取异常类名和异常信息，返回字符串。
    * c:printStackTrace()
    * 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
    */
    public static void main(String[] args) {
        try {
            System.out.println(1/0);//1/0会发生除0异常
        } catch (Exception e) {
       //当发生异常的时候相当于Exception e = new ArithmeticException("/ by zero");给了e一个地址值
//            System.out.println(e.getMessage());//获取异常信息,返回字符串。

//            System.out.println(e.toString());//当你输入e不写toString他会默认给你调用
            //e.toString()获取异常类名和异常信息，返回字符串。

            //获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
            e.printStackTrace();//jvm默认处理异常的方式
        }

    }

}
