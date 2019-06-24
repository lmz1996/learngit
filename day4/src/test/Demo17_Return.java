package test;

public class Demo17_Return {
/*
 * A:return的作用
    * 返回
    * 其实它的作用不是结束循环的，而是结束方法的
 */
    public static void main(String[] args) {
        for (int i =1; i<20;i++) {
            if(i==4) {
//                break;//break跳出当前循环会输出循环结束了
                return;//直接跳出整个方法不会输出循环结束了
            }
        }
        System.out.println("循环结束了");
    }

}
