package com.sbibits.exception;

public class Demo8_Finally {
/*
 * :finally的特点
    * 被finally控制的语句体一定会执行
    * 特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
    * System.exit(0)退出java虚拟机,它是唯一一个不执行finally的情况
 * B:finally的作用
    * 用于释放资源，在IO流操作和数据库操作中会见到
 * C:案例演示
    * finally关键字的特点及作用
 */
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("出错了");
            return;
            // return是跳出当前的方法,那么为什么我加上return了还是会到finally中呢。
            // 因为return可以看做这个方法的最后一口气,那么finally就是它的最后的心愿,他想去看下finally看看流什么的关没关
      //如果有就将finally执行完返回
        } finally {
            // 就算catch里面加了return,finally也会执行
            System.out.println("我必须执行");
            // 被finally控制的语句体一定会执行,用于释放资源，在IO流操作和数据库操作中会见到
        }
        System.out.println("end");

    }

}
