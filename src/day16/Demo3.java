package day16;

import java.util.LinkedList;

public class Demo3 {
/*
 *A:LinkedList�����
* B:LinkedList�����й���
    * public void addFirst(E e)��addLast(E e)
    * public E getFirst()��getLast()
    * get(index)�������ǰ���������ѯ���ǲ��ǣ����ȳ�2������ͷ������β����Ȼ����һ������ǰ�����ȡ
    * ���Բ�ѯ��
    * public E removeFirst()��public E removeLast()
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
