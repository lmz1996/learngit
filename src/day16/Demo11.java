package day16;

public class Demo11 {
/* A:可变参数概述
     * 定义方法的时候不知道该定义多少个参数
    * B:格式
        * 修饰符 返回值类型 方法名(数据类型…  变量名){}
    * C:注意事项：
        * 这里的变量其实是一个数组
        * 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
        */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        print(arr);
        //当不知道多少个参数就用可变参数传递的变量其实就是一个数组
        show(1,2,3,4,5);

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    private static void show(int x,int ... arr){
        for (int i = 0; i < arr.length; i++) {
//            如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
            System.out.println(x+","+arr[i]);
        }
    }

}
