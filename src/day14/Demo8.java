package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8 {
    /* ���͵ĵ���˳���� 
    * Pattern p = Pattern.compile("a*b");
    * Matcher m = p.matcher("aaaaab");
    * boolean b = m.matches();
    */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");//������������ʽ
        Matcher m = p.matcher("aaaaab");//��ȡƥ����
        boolean b = m.matches();//���Ƿ�ƥ�䣬ƥ�䷵��
        System.out.println(b);
        //�൱��System.out.println("aaaaab".matches("a*b"));
    }

}
