package test;

public class Demo8_While {
/*
 * A:求和思想
    * 求1-100之和
* B:统计思想
    * 统计”水仙花数”共有多少个
 */
    public static void main(String[] args) {
        // 求和思想
        // getSum();
        // 统计思想
        int count = 0;
        int i = 100;// 因为水仙花是3位的所以初始化设100
        while (i <= 999) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
            }
            i++;
        }
        System.out.println(count);

    }

    private static void getSum() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;// sum = sum +i;
            i++;
        }
        System.out.println(sum);
    }

}
