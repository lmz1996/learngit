package day15;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

    public static void main(String[] args) {
        demo_1();
        
    }

    private static void demo_1() {
        //collection��һ���ӿڲ���ʵ�������������ø�������ָ���������
        Collection c = new ArrayList();//��������ָ���������
        boolean b1= c.add("abc");
        boolean b2 = c.add(true);//���Ϸŵ��������������ͣ��Ż����������ͻ��Զ�װ��
        //�൱�ڷ�װ�Ƕ���ӽ�ȥnew Boolean(true)
        System.out.println(b1);
        System.out.println(b2);
    }

}
