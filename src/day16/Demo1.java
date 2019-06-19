package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    // 去掉一个集合中重复的
    // 分析：
    /*
     * 创建新集合 根据旧的集合获取迭代器 遍历老集合 通过判断是否重复插入新的集合中
     */
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>();
        arrList.add("10");
        arrList.add("10");
        arrList.add("10");
        arrList.add("20");
        arrList.add("20");
        arrList.add("30");
        arrList.add("40");
        arrList.add("40");
        arrList.add("50");

        demo_1(arrList);
    }

    private static void demo_1(List arrList) {

        List singeList = new ArrayList();
        Iterator it = arrList.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (!singeList.contains(o)) {
                singeList.add(o);
            }
        }
        Iterator<String> it1 = singeList.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }

}
