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
        c.add(new Student("lisi", 21));// 自动提升类型相当于Object c = new
                                       // Student("zhangsan",20)
        c.add(new Student("wangwu", 22));
        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            // 如果想要獲得get方法的值需要向下提升類型，因為父類引用子類父類不能使用子類獨有的特性
            Student s = (Student) array[i];
            System.out.println(s.getName() + "..." + s.getAge());
            // System.out.println(array[i]);//輸出的是一個數組

        }
    }

}
