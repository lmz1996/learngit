package day16;

import java.util.LinkedList;

public class Stack {
    LinkedList list = new LinkedList();

    public void in(Object obj) {
        list.addLast(obj);
    }

    public Object out() {
        return list.removeLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

}
