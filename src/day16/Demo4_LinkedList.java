package day16;

public class Demo4_LinkedList {
    /*
     * ��LinkedListģ��ջ�ṹ,�Ƚ����
     */
    public static void main(String[] args) {
        Stack stack = new Stack();//����ջ�ṹ
        stack.in("a");
        stack.in("b");
        stack.in("c");              //��ջ
        while (!stack.isEmpty()) {
            System.out.println(stack.out());//��Ϊ�վ�һֱ��ջ
        }

    }

}
