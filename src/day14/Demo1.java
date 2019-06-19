package day14;

public class Demo1 {
  /*  [abc] a��b �� c�����ࣩ,������ǵ����ַ������Ҫ��aa�ʹ���
    * [^abc] �κ��ַ������� a��b �� c���񶨣� 
    * [a-zA-Z] a�� z �� A�� Z����ͷ����ĸ�������ڣ���Χ�� 
    * [0-9] 0��9���ַ�������
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
        String regex = "[a-z&&[^def]]";//&&�ǽ�������˼�൱��a-z���Ҳ�����def
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
        String regex = "[a-zA-Z]";//�����Ŵ������ַ�
        System.out.println("a".matches(regex));
        System.out.println("A".matches(regex));
        System.out.println("z".matches(regex));
        System.out.println("Z".matches(regex));
        System.out.println("1".matches(regex));
    }

    private static void demo_2() {
        String regex = "[^abc]";     //^��������
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
