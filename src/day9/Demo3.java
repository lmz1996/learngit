package day9;

public class Demo3 {
/*
 * ��̬�ĺô��ͱ׶�
 * a:����˴����ά���ԣ��̳б�֤)
 * b:����˴������չ�ԣ��ɶ�̬��֤��
 * c:���Ե�����ʽ���������Խ��������������
 * ��̬��ȱ��:
 * ����ʹ��������������Ի�����Ϊ,Ҫ��ʹ�þͱ���Ҫǿת
 */
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.eat();                   �����������������鷳
//        Dog d = new Dog();
//        d.eat();
        method(new Cat());
        method(new Dog());
    }
    //����˴������չ�ԣ��ɶ�̬��֤��
    //���Ե�����ʽ���������Խ��������������
    public static void method(Animals a) {
        //�����Ҫʹ���������е�������ô����Ҫǿת
        //�ؼ���instinseof�ж�ǰ�ߵ������Ƿ��Ǻ�ߵ���������
        if (a instanceof Cat) {
            Cat c = new Cat();
            c.eat();
            c.catchMouse();
        } else if (a instanceof Dog) {
            Dog d = new Dog();
            d.eat();
            d.lookHouse();
        } else {
            a.eat();
        }
        
    }
}

class Animals {
    public void eat() {
        System.out.println("����Զ���");
    }
}

class Cat extends Animals{
    public void eat() {
        System.out.println("è����");
    }

    public void catchMouse() {
        System.out.println("ץ����");
    }
}

class Dog extends Animals{
    public void eat() {
        System.out.println("������");
    }

    public void lookHouse() {
        System.out.println("����");
    }
}
