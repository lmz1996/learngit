package day14;

public class Demo4 {
    /*
     * ������ʽ�ķָ��
     */
public static void main(String[] args) {
//    demo_1();
    String a = "hello.word.everyone";
    String[] arr = a.split("\\.");//ע��.���������ַ��������Ҫ��.��������\\ת���ַ�
    
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

}

    private static void demo_1() {
        String a = "hello word everyone";
        String[] arr = a.split(" ");//�ÿո�ָע��.���������ַ��������Ҫ��.��������\\ת���ַ�
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
