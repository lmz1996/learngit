package day8;

public class Demo2 {
    public static void main(String[] args) {
       Son son = new Son();
           son.print();
    }
}

class Father {
    int num1 = 10;
}

class Son extends Father {
    int num2 = 20;
    public void print() {
        System.out.println(this.num2);
        //��Ȼ�����в�û��num1���Ǽ̳��˸�������Ҳ������this.num1
        //����������ø���Ĺ��췽����super
        System.out.println(this.num1);
        System.out.println("============");
        System.out.println(super.num1);

    }
}
