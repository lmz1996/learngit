package day14;

public class Demo6 {
/*
 * ������ʽ���滻����
 */
    public static void main(String[] args) {
        String a = "sbi123bits";
        String regex = "\\d";
        String s = a.replaceAll(regex,"");
        System.out.println(s);
    }

}
