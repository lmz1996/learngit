package day14;

public class Demo3 {
    /*A:Greedy ������ 
    * X? X��һ�λ�һ��Ҳû��  X���������ַ�
    * X* X����λ��ΰ���һ��
    * X+ X��һ�λ���
    * X{n} X��ǡ�� n �� 
    * X{n,} X������ n �� 
    * X{n,m} X������ n �Σ����ǲ����� m �� 
    */
    public static void main(String[] args) {
//        demo_1();
        String regex = "[abc]*";
        System.out.println("".matches(regex));
        System.out.println("abc".matches(regex));//���
        System.out.println("a".matches(regex));

    }

    private static void demo_1() {
        String regex = "[abc]?";//����a,b,c����һ�λ���һ�ζ�û��(ֻ���a,b,c�����������)
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("".matches(regex));//һ��Ҳû��
        System.out.println("d".matches(regex));
    }

}
