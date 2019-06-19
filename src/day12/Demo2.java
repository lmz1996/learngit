package day12;

public class Demo2 {

    public static void main(String[] args) {
        // demo_1();
        // demo_2();
        // demo3();
        // demo_4();
        demo5();
    }

    private static void demo5() {
        // 把一个字符串的首字母变成大写其他的小写
        String s5 = "wfaWRF";
        String a1 = s5.substring(0, 1).toUpperCase().concat(s5.substring(1).toLowerCase());
        System.out.println(a1);
    }

    private static void demo_4() {
        String s3 = "AFAWvcsfs";
        String s4 = "sdfsdDD";
        System.out.println(s3.toLowerCase());
        System.out.println(s4.toUpperCase());
    }

    private static void demo3() {
        // static String ValueOf(char[] chs);把字符数组转换成字符串
        char[] arr = { 'a', 'b', 'c' };
        String s = String.valueOf(arr);// 底层是由String类的构造方法完成的
        System.out.println(s);
    }

    private static void demo_2() {
        // char[] toCharArray(); 把字符串转换成字符数组
        String s2 = "addas";
        char[] arr = s2.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    private static void demo_1() {
        // byte[] getBytes():把字符串转换成字节数组
        String s1 = "abc";
        byte[] arr = s1.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
