package day9;

public class Demo2 {

    public static void main(String[] args) {
        People1 people = new SuperMan1();//��������ָ����������������ת��
        System.out.println(people.name);
        people.method();
        //һ��Ҫ��������ת��Ȼ��������ת��
        SuperMan1 sm1 = (SuperMan1)people;//����ת��
        sm1.fly(); //��������ת�Ͳ��ܵ��� 
        

    }
}

class People1 {
     String name = "man";

    public void method (){
        System.out.println("̸����");
    }
}

class SuperMan1 extends People1{
    //��������
    public void method (){
        System.out.println("̸dadanzi");
    }
    public void fly (){
        System.out.println("����");
    }
}

