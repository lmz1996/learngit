package com.sbibits.exception;

public class Demo1_Exception {
    /*
     * try是用来检测异常的 catch:是用来捕获异常的 finally:释放资源，关闭IO流
     */
    /*
     * A:异常处理的两种方式 a:try…catch…finally try catch try catch finally try finally
     * b:throws B:try...catch处理异常的基本格式 try…catch…finally C:案例演示
     * try...catch的方式处理1个异常
     */
    public static void main(String[] args) {
        Demo demo = new Demo();
        try{
            int div = demo.div(10, 0);
            System.out.println(div);
        }catch (ArithmeticException a) {
           System.out.println("出错了发生异常了");
        }
        System.out.println(111);//虽然发生异常但是catch处理异常了还是可以继续执行
    }

}
class Demo {
    public int div(int a,int b){
        int num = a/b;
        return num;
    }
}