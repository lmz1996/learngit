package test;

public class Demo13_Break {
/*
 * Java语言基础(控制跳转语句break语句)
* A:break的使用场景
    * 只能在switch和循环中写在别的位置报错,break跳出整个循环
 */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                break;//当前跳出循环
            }
            System.out.println(i);
        }

    }

}
