package day8;

/*
 * ִ��˳������
 * ����jvm������main����main������ջ
 * ������Bmw bmw = new Bmw()�ὫCar.class��Bmw.class�ֱ���ص��ڴ���,
 * ����class�ļ����ص��ڴ��о�̬���������,
 * ��˵�һ���������ľ�̬����飬�ڶ����������ľ�̬�����
 * ��class���ص����ڴ�֮��ͻᴴ������,������Bmw�Ĺ��췽��
 * ��������Ĺ��췽���ĵ�һ�б��������ص�super����������ÿ������һ�����󶼱�������¸�����޲ι��췽��
 * ��˻��ȵ����࣬�������ڵ��˸����У��������������ڹ��췽��ִ��
 * �������������Ĺ������飬���ĸ��������Ĺ��췽��
 * �������ʼ����ɺ�Ż��ʼ������
 * ��˵�����������Ĺ��췽���飬�������������Ĺ��췽��
 */
public class Demo4 {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
    }
}

class Car {
    static {
        System.out.println("����ľ�̬�����");
    }

    {
        System.out.println("����Ĺ�������");
    }

    public Car() {
        System.out.println("����Ĺ��췽��");
    }
}

class Bmw extends Car{
    static {
        System.out.println("����ľ�̬�����");
    }

    {
        System.out.println("����Ĺ�������");
    }

    public Bmw() {
        System.out.println("����Ĺ��췽��");
    }
}