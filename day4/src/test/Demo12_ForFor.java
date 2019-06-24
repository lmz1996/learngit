package test;

public class Demo12_ForFor {
//在控制台输出九九乘法表
    /*
     * 跟正三角一个思路
     * 1*1=1
     * 1*2=2 2*2=4
     * ....
     */
    public static void main(String[] args) {
        for (int i = 1;i<=9;i++) {
            for (int j = 1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+(i*j) +"\t");
            }
            System.out.println();
        }

    }

}
