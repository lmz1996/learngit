package day14;

public class Demo1 {
  /*  [abc] a、b 或 c（简单类）,代表的是单个字符，如果要是aa就错了
    * [^abc] 任何字符，除了 a、b 或 c（否定） 
    * [a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围） 
    * [0-9] 0到9的字符都包括
 * 
 */
    public static void main(String[] args) {
//        demo_1();
//        demo_2();
//        demo_3();
//        demo_4();
//        demo_5();
    }

    private static void demo_5() {
        String regex = "[a-z&&[^def]]";//&&是交集的意思相当于a-z并且不包含def
        System.out.println("a".matches(regex));
        System.out.println("d".matches(regex));
    }

    private static void demo_4() {
        String regex = "[a-dm-p]";//[a-d[m-p]]
        System.out.println("a".matches(regex));
        System.out.println("m".matches(regex));
        System.out.println("g".matches(regex));
        System.out.println("A".matches(regex));
    }

    private static void demo_3() {
        String regex = "[a-zA-Z]";//中括号代表单个字符
        System.out.println("a".matches(regex));
        System.out.println("A".matches(regex));
        System.out.println("z".matches(regex));
        System.out.println("Z".matches(regex));
        System.out.println("1".matches(regex));
    }

    private static void demo_2() {
        String regex = "[^abc]";     //^代表不等于
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("d".matches(regex));
    }

private static void demo_1() {
    String regex = "[abc]";
    System.out.println("a".matches(regex));
    System.out.println("b".matches(regex));
    System.out.println("c".matches(regex));
    System.out.println("cc".matches(regex));
    System.out.println("d".matches(regex));
}

}
