package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
    /*
     * 去除ArrayList中的自定义对象元素 A:案例演示 需求：ArrayList去除集合中自定义对象元素的重复值（对象的成员变量值相同）
     * B:注意重写equals方法（因为contains方法底层用的是equals方法，new对象的地址值都不同，equals比较的是指，
     * 所以我们需要在Person中重写equals方法,否则就会用object的equals方法比较的是地址值
     */
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();
        arrList.add(new Person("张三", 20));
        arrList.add(new Person("张三", 20));
        arrList.add(new Person("李四", 21));
        arrList.add(new Person("王五", 22));
        ArrayList newList = demo_1(arrList);
        System.out.println(newList);

    }

    private static ArrayList demo_1(ArrayList arrList) {

        ArrayList singeList = new ArrayList();
        Iterator it = arrList.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (!singeList.contains(o)) {
                singeList.add(o);
            }
        }
        return singeList;
    }

}
