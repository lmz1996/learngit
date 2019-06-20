package com.sbibits.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo1 {
/*
 *  键盘录入一个int类型的整数,对其求二进制表现形式
     * 如果录入的整数过大,给予提示,录入的整数过大请重新录入一个整数BigInteger
     * 如果录入的是小数,给予提示,录入的是小数,请重新录入一个整数
     * 如果录入的是其他字符,给予提示,录入的是非法字符,请重新录入一个整数
 
 */
    /*
     * 分析:
     * 1:创建键盘录入对象
     * 2:将键盘录入的结果存储在string类型的字符集中,因为存储int类型中如果有不符合条件的直接报错,无法进行判断
     * 3:键盘录入的结果转换成int类型,是正确的还是错误的
     * 4:正确的直接转换
     * 5:错误的要进行对应的判断
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        while (true) {
            String line = sc.nextLine();
            try {

                int num = Integer.parseInt(line);
                System.out.println(Integer.toBinaryString(num));
                break;
            } catch (Exception e) {
                try {
                    new BigInteger(line);// 只要能够放在BigInteger中就能够说明他是过大的整数了,但是还有可能是小数。所以还需要try
                                         // catch
                    System.out.println("这是一个过大的整数请重新输入一个整数:");
                } catch (Exception e1) {
                    try {
                        new BigDecimal(line);// 如果能够放进去说明是小数,还可能是字母所以还需要try
                                             // catch
                        System.out.println("这是一个小数请重新输入一个整数:");
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        System.out.println("您入力的是一个非法字符请重新录入");
                    }
                }
            }
        }

    }

}
