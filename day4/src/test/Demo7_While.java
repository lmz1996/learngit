package test;

public class Demo7_While {
/*格式:
 * 初始化语句;
        while(判断条件语句) {
             循环体语句;
             控制条件语句;
        }
 */
    public static void main(String[] args) {
        int x = 1;//初始化语句
        while (x <= 10) {//如果是true，就继续执行如果是false,就结束循环
            System.out.println(x);
            x++;
        }

    }

}
