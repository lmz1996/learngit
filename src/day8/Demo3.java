package day8;

public class Demo3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        int a = 5;
        Dog dog1 = new Dog(a);
        //��Ϊʵ����һ�ξͻ����һ�ι��췽������super���������θ�����޲ι��췽��
    }
}

class Animals {
    public Animals() {
        System.out.println("����");
    }
}

class Dog extends Animals {
    // ����ÿ����һ�ι��췽������ȥ�ȷ��ʸ�����޲ι��췽��,��Ϊ���췽����Ĭ�ϵ���super()����,
    // ����ø���Ĺ��췽��,ֻ�и����ʼ�����º�Ż��ʼ������
    public Dog() {
        //super();���super()�����ǲ���Ҫд���Դ��ĵ��ø���ġ�������Ҳ��һ�����ص�super��
        //�����super���õ���Object
        System.out.println("����");
    }

    public Dog(int a) {
      //super();
        System.out.println("����" + a + "��");
    }
}
