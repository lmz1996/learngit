package day16;

public class Demo6 {

    public static void main(String[] args) {
//      demo_1();
        //���ͷ���
        Tool<String> tool = new Tool<String>();
        tool.show("abc");//show�ķ��ͺ�ķ���һ��
        tool.print(123);
        tool.show1(true);
    }

    private static void demo_1() {
        //�����ʹ��
            Tool<Person> tool = new Tool<Person>();//�൱�ڸ�Q�ķ�����Person
            tool.setQ(new Person("����",20));
            System.out.println(tool.getQ());
    }

}
