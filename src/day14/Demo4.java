package day14;

public class Demo4 {
    /*
     * 正则表达式的分割功能
     */
public static void main(String[] args) {
//    demo_1();
    String a = "hello.word.everyone";
    String[] arr = a.split("\\.");//注意.代表任意字符，如果想要用.得用两个\\转义字符
    
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

}

    private static void demo_1() {
        String a = "hello word everyone";
        String[] arr = a.split(" ");//用空格分割。注意.代表任意字符，如果想要用.得用两个\\转义字符
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
