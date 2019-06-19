package day15;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

    public static void main(String[] args) {
        demo_1();
        
    }

    private static void demo_1() {
        //collection是一个接口不能实例化所以我们用父类引用指向子类对象
        Collection c = new ArrayList();//父类引用指向子类对象
        boolean b1= c.add("abc");
        boolean b2 = c.add(true);//集合放的是引用数据类型，放基本数据类型会自动装箱
        //相当于封装城对象加进去new Boolean(true)
        System.out.println(b1);
        System.out.println(b2);
    }

}
