package day9;

public class Demo1 {
/*
 * ��̬��ǰ�ᣨҪ�м̳й�ϵ��Ҫ�з�����д��Ҫ�и�������ָ���������
 * ��Ա���� ���뿴��ߣ����ࣩ�����п���ߣ����ࣩ
 * ��Ա���� ���뿴��ߣ����ࣩ�����п��ұߣ����ࣩ
 * ��̬���� ���뿴��ߣ����ࣩ�����п����(����)
 * ��̬��������㲻����д�����Է��ʵĻ�����ߵģ�ֻ�зǾ�̬�ĳ�Ա�����Ż����п��ұ�
 */
    public static void main(String[] args) {
        People people = new SuperMan();//��������������󣬳�������Ϊ����
        System.out.println(people.name);
        people.method();
//        people.fly(); ��Ҫת��
        

    }
}

class People {
     String name = "man";

    public void method (){
        System.out.println("̸����");
    }
}

class SuperMan extends People{
    //��������
    public void method (){
        System.out.println("̸dadanzi");
    }
    public void fly (){
        System.out.println("����");
    }
}

