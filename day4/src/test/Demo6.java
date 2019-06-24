package test;

public class Demo6 {
    /*
     * 需求：统计”水仙花数”共有多少个
     * 分析:
     * 1:需要有一个变量记录水仙花的个数
     * 2:获取到所有的3位数
     * 3:判断是否满足水仙花数
     * 4:如果满足条件计数就加一
     */
    public static void main(String[] args) {

        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
            }
        }
        System.out.println(count);
    }

}
