package day10;

public class Demo_4 {

    public static void main(String[] args) {
        Demo_Person dp = new Demo_Person();
        dp.method(new Person() {  //�����ڲ��൱���������ݣ����ʰ��ڲ��൱����һ������

            @Override
            public void print() {
                System.out.println("aaa");

            }

        });
    }

}
//����д������ӿڶ���
abstract class Person {
    public abstract void print();
}

class Demo_Person {
    public void method(Person p) {
        p.print();
    }
}