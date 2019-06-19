package day16;

import java.util.LinkedList;

public class Demo3 {
/*
 *A:LinkedList类概述
* B:LinkedList类特有功能
    * public void addFirst(E e)及addLast(E e)
    * public E getFirst()及getLast()
    * get(index)看起来是按照索引查询但是不是，它先除2看你离头近还是尾近，然后在一个个往前往后获取
    * 所以查询慢
    * public E removeFirst()及public E removeLast()
 */
    public static void main(String[] args) {
//        addFirst();
//        addLast();
//        getFirstLast();
       
        
    }

    private static void getFirstLast() {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addFirst("e");
        list.addLast("f");//addLast
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }

private static void addLast() {
    LinkedList list = new LinkedList();
    list.addFirst("a");
    list.addFirst("b");
    list.addFirst("c");
    list.addFirst("d");
    list.addFirst("e");
    list.addLast("f");//addLast
    System.out.println(list);
}

    private static void addFirst() {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addFirst("e");
        System.out.println(list);
    }

}
