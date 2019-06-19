package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo4 {
    /*
     * 迭代
     */

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // Iterator it =c.iterator();//获取迭代器
        // boolean i = it.hasNext();//判断是否含有元素
        // System.out.println(it.next());//next后指针指向下一个

    }

}
