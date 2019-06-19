package day14;

public class Demo2 {
    /* . 任何字符。一个点只代表一个字符
    * \d 数字：[0-9] 代表单个数字字符。注意\代表转转义字符。所以\\b
    * \D 非数字
    * \w 单词字符：[a-zA-Z_0-9]
    */
    public static void main(String[] args) {
//        demo_1();
//        demo_2();
//        demo_4();
//        demo_3();
    }

    private static void demo_3() {
        String regex = "\\w";//第一个\是转义字符
        System.out.println("a".matches(regex));
        System.out.println("_".matches(regex));
        System.out.println("Z".matches(regex));
    }

    private static void demo_4() {
        String regex = "\\D";//第一个\是转义字符
        System.out.println("1".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println(".".matches(regex));
    }

    private static void demo_2() {
        String regex = "\\d";//第一个\是转义字符
        System.out.println("1".matches(regex));
        System.out.println("21".matches(regex));
    }

    private static void demo_1() {
        String regex = ".";
        System.out.println("a".matches(regex));
        System.out.println("aa".matches(regex));
        String regex1 = "..";
        System.out.println("a".matches(regex1));
        System.out.println("aa".matches(regex1));
    }

}
