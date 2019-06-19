package day16;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo10 {
    /*
     * 集合框架(三种迭代的能否删除)(掌握) 普通for循环,可以删除,但是索引要i--
     * 迭代器,可以删除,但是必须使用迭代器自身的remove方法,否则会出现并发修改异常 
     * 增强for循环不能删除,因为foreach底层用的是迭代器,不能用list的remove方法会发生并发修改删除
     * 所以不行
     */
    public static void main(String[] args) {
        // 普通for循环删除
        // demo1();
        // 迭代器删除
       demo2();
    }

    private static void demo2() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("a");
        arrList.add("b");
        arrList.add("b");
        arrList.add("c");
        arrList.add("d");
        arrList.add("e");
        Iterator<String> it = arrList.iterator();
        while (it.hasNext()) {
            if ("b".equals(it.next())) {
// 注意一定要用迭代器的remove进行删除，如果在迭代的过程中用集合的remove方法进行修改,会发生并发修改异常
                it.remove();
            }
        }
        System.out.println(arrList);
    }

    private static void demo1() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("a");
        arrList.add("b");
        arrList.add("b");
        arrList.add("c");
        arrList.add("d");
        arrList.add("e");
        for (int i = 0; i < arrList.size(); i++) {
            if ("b".equals(arrList.get(i))) {
                // 普通for循环,可以删除,但是索引要i--
                // 因为两个连续相同的如果不--那么只能够删除一个
                // 因为当i等于的时候第一个b删除了那么下一个b就会定上去然后i++了那么b就会被跳过去直接到c了
                arrList.remove(i--);// 让i的指针先回退一个,然后在加一
            }

        }
        System.out.println(arrList);
    }

}
