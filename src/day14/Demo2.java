package day14;

public class Demo2 {
    /* . �κ��ַ���һ����ֻ����һ���ַ�
    * \d ���֣�[0-9] �����������ַ���ע��\����תת���ַ�������\\b
    * \D ������
    * \w �����ַ���[a-zA-Z_0-9]
    */
    public static void main(String[] args) {
//        demo_1();
//        demo_2();
//        demo_4();
//        demo_3();
    }

    private static void demo_3() {
        String regex = "\\w";//��һ��\��ת���ַ�
        System.out.println("a".matches(regex));
        System.out.println("_".matches(regex));
        System.out.println("Z".matches(regex));
    }

    private static void demo_4() {
        String regex = "\\D";//��һ��\��ת���ַ�
        System.out.println("1".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println(".".matches(regex));
    }

    private static void demo_2() {
        String regex = "\\d";//��һ��\��ת���ַ�
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
