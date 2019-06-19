package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8 {
    /* 典型的调用顺序是 
    * Pattern p = Pattern.compile("a*b");
    * Matcher m = p.matcher("aaaaab");
    * boolean b = m.matches();
    */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");//传的是正则表达式
        Matcher m = p.matcher("aaaaab");//获取匹配器
        boolean b = m.matches();//看是否匹配，匹配返回
        System.out.println(b);
        //相当于System.out.println("aaaaab".matches("a*b"));
    }

}
