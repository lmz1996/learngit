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
        //虽然子类中并没中num1但是继承了父类所以也可以用this.num1
        //正常子类调用父类的构造方法用super
        System.out.println(this.num1);
        System.out.println("============");
        System.out.println(super.num1);

    }
}
