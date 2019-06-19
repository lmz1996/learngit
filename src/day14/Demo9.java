package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo9 {
    // 需求：把一个字符串中的手机号码获取出来
    public static void main(String[] args) {
        String s = "我的手机号码是15456782222,还用过17354222541";
        String regex = "1[3578]\\d{9}";// {9}是出现几次。第一位必须是1,第二位是3578的一个。其他9位是数字就行
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        // boolean b = m.matches();
        // boolean b =m.find();//拿着正则去找符合规则的那部分，找到返回true
        // System.out.println(b);
        // 把符合正则的拿出来，注意必须先find在获取
        // String s1=m.group();
        // System.out.println(s1);
        while (m.find()) {
            // 把符合正则的拿出来，注意必须先find在获取
            String s1 = m.group();
            System.out.println(s1);
        }

    }

}
