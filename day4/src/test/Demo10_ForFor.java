package test;

public class Demo10_ForFor {
/*
 * ###04.11_Java语言基础(循环结构循环嵌套输出4行5列的星星)
* A:案例演示
    * 需求：请输出一个4行5列的星星(*)图案。
    * 
            如图：
                *****
                *****
                *****
                *****
* B:结论：
    * 外循环控制行数，内循环控制列数
 */
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {//外循环
            for (int j = 1; j <= 5; j++) {
                //内循环,当进入一个外循环时内循环全部遍历后才会外循环第二次
                //外循环输出一次,内循环输出一圈
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
