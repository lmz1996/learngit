package day15;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3 {
    /*
     * ��All�Ĺ�����ʾ boolean addAll(Collection c)
     *  boolean removeAll(Collection c)
     * boolean containsAll(Collection c) 
     * boolean retainAll(Collection c)ȡ����
     */

    public static void main(String[] args) {
//        demo_1();
//        demo_3();
        demo_2();  
    }

    private static void demo_2() {
        Collection c = new ArrayList();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        Collection c1 = new ArrayList();
        c1.add("2");
        c1.add("3");
        c.retainAll(c1);
        System.out.println(c);
    }

    private static void demo_3() {
        Collection c = new ArrayList();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        Collection c1 = new ArrayList();
        c1.add("2");
        c1.add("3");
        c.removeAll(c1);//�h������
        System.out.println(c);
    }

    private static void demo_1() {
        Collection c = new ArrayList();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        Collection c1 = new ArrayList();
        c1.add("5");
        c1.add("6");
        c1.add("7");
        c1.add("8");
        c.addAll(c1);      //�������е�Ԫ�طŽ�ȥ
//        c.add(c1);       //��c1������һ������ӵ�c��[1, 2, 3, 4,[5, 6, 7, 8]]
        System.out.println(c);
    }

}
