package day15;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2 {

    public static void main(String[] args) {
        demo_1();

    }

    private static void demo_1() {
        Collection c = new ArrayList();
        c.add(new Student("zhangsan", 20));
        c.add(new Student("lisi", 21));// �Զ����������൱��Object c = new
                                       // Student("zhangsan",20)
        c.add(new Student("wangwu", 22));
        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            // �����Ҫ�@��get������ֵ��Ҫ����������ͣ���鸸�����������ʹ������е�����
            Student s = (Student) array[i];
            System.out.println(s.getName() + "..." + s.getAge());
            // System.out.println(array[i]);//ݔ������һ�����M

        }
    }

}
