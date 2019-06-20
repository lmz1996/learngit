package com.sbibits.exception;

public class Demo2_Exception {
/*
 *  try...catch的方式处理多个异常,当多个catch时第一个catch了就不走其他的catch了直接跳出TryCatch。
    如果异常种类太多那么可以写一个Exception这个是其他异常的父类。相当于父类引用子类对象。Exception e = new ArithmeticException（）;
    try后面如果跟多个catch，小的异常放前面大的异常放后面。根据多态的原理，如果大的放在前面,就会将所有的子类对象接收后面的catch就没有意义了
    javaEE,服务端开发，一般是底层开发，从底层向上抛。
 */
    public static void main(String[] args) {
//        demo1();
        /*
         * JDK7以后处理多个异常的方式及注意事项
            jdk7加了个（|)代表一个或两个异常中间加上一个竖线，但是不好。还不如直接抛出一个exception
         */
        Demo1 demo = new Demo1();
        try {
            int div = demo.div(10, 0);
            int[] arr = { 1, 3, 4 };
            int a = arr[5];// 越界异常
        } catch (ArithmeticException |ArrayIndexOutOfBoundsException a) {
            System.out.println("exception");
        } catch (Exception e) {
            System.out.println("出错了");
        }
    }

    private static void demo1() {
        Demo1 demo = new Demo1();
        try {
            int div = demo.div(10, 0);
            int[] arr = { 1, 3, 4 };
            int a = arr[5];// 越界异常
        } catch (ArithmeticException a) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("索引越界了");
        } catch (Exception e) {
            System.out.println("出错了");
        }
    }

}

class Demo1 {
    public int div(int a, int b) {
        int num = a / b;
        return num;
    }
}