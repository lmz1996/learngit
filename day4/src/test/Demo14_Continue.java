package test;

public class Demo14_Continue {
/*
 * Java语言基础(控制跳转语句continue语句)
* A:continue的使用场景
    * 只能在循环中
 */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                continue;//终止本次循环,继续下次循环。不向下进行了,直接下一次循环
            }
            System.out.println(i);
        }

    }

}
