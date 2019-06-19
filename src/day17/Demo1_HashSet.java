package day17;

import java.util.HashSet;

public class Demo1_HashSet {
    /*
     * set集合无索引,不可以重复,无序(存取不一致)
     */
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        boolean b1 = hashSet.add("a");
        boolean b2 = hashSet.add("a");
        // System.out.println(b1);
        // System.out.println(b2);//当想set集合中添加重复元素时返回false
        hashSet.add("b");
        hashSet.add("d");
        hashSet.add("c");
        for (String string : hashSet) {//只要能用迭代器的都能使用foreach
            System.out.println(string);
        }
        System.out.println(hashSet);// hashSet的继承体系中有重写toString方法

    }

}
