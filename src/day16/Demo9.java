package day16;

import java.util.ArrayList;

public class Demo9 {
    /*
     * A:��ǿfor���� �������Collection���ϵı��� B:��ʽ��
     * 
     * for(Ԫ���������� ���� : �������Collection����) { ʹ�ñ������ɣ��ñ�������Ԫ�� } C:������ʾ
     * ���飬���ϴ洢Ԫ������ǿfor���� D:�ô� �򻯱���
     */
    public static void main(String[] args) {
        // demo1();
        // demo2();
        demo3();

    }

    private static void demo3() {
        // �Զ������
        ArrayList<Person> arrList = new ArrayList<Person>();
        arrList.add(new Person("����", 20));
        arrList.add(new Person("����", 21));
        for (Person person : arrList) {
            System.out.println(person);
        }
    }

    private static void demo2() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("����");
        arrList.add("�w��");
        for (String string : arrList) {
            System.out.println(string);
        }
    }

    private static void demo1() {
        int[] arr = { 1, 3, 5, 7 };
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
