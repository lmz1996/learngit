package day16;

public class Demo4_LinkedList {
    /*
     * 用LinkedList模仿栈结构,先进后出
     */
    public static void main(String[] args) {
        Stack stack = new Stack();//创建栈结构
        stack.in("a");
        stack.in("b");
        stack.in("c");              //进栈
        while (!stack.isEmpty()) {
            System.out.println(stack.out());//不为空就一直出栈
        }

    }

}
