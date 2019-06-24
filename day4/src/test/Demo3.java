package test;

public class Demo3 {
/*
 *  A:案例演示
    * 需求：求出1-10之间数据之和
    * 分析:0+1
    *     1+2
    *     3+3
    *     .....
*   B:学生练习
    * 需求：求出1-100之间偶数和
    * 需求：求出1-100之间奇数和
 */
    public static void main(String[] args) {
        int sum =0;
        for (int i=1;i<=10;i++) {
             sum = sum + i;
        }
        System.out.println(sum);
    }

    
}
