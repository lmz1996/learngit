package test;

public class Demo11_ForFor {
    /*
     * 需求：请输出下列的形状
     *
     **
     ***
     ****
     *****
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {//外循环决定行数
            for (int j = 1; j <= i; j++) {//内循环决定列数
                System.out.print("*");
            }
            System.out.println();//换行
        }

    }

}
