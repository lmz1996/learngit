package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo9 {
    // ���󣺰�һ���ַ����е��ֻ������ȡ����
    public static void main(String[] args) {
        String s = "�ҵ��ֻ�������15456782222,���ù�17354222541";
        String regex = "1[3578]\\d{9}";// {9}�ǳ��ּ��Ρ���һλ������1,�ڶ�λ��3578��һ��������9λ�����־���
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        // boolean b = m.matches();
        // boolean b =m.find();//��������ȥ�ҷ��Ϲ�����ǲ��֣��ҵ�����true
        // System.out.println(b);
        // �ѷ���������ó�����ע�������find�ڻ�ȡ
        // String s1=m.group();
        // System.out.println(s1);
        while (m.find()) {
            // �ѷ���������ó�����ע�������find�ڻ�ȡ
            String s1 = m.group();
            System.out.println(s1);
        }

    }

}
