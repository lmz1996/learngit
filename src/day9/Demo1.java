package day9;

public class Demo1 {
/*
 * 多态的前提（要有继承关系，要有方法重写，要有父类引用指向子类对象）
 * 成员变量 编译看左边（父类），运行看左边（父类）
 * 成员方法 编译看左边（父类），运行看右边（子类）
 * 静态方法 编译看左边（父类），运行看左边(父类)
 * 静态和类相关算不上重写，所以访问的还是左边的，只有非静态的成员方法才会运行看右边
 */
    public static void main(String[] args) {
        People people = new SuperMan();//父类引用子类对象，超人提升为了人
        System.out.println(people.name);
        people.method();
//        people.fly(); 需要转型
        

    }
}

class People {
     String name = "man";

    public void method (){
        System.out.println("谈生意");
    }
}

class SuperMan extends People{
    //方法重新
    public void method (){
        System.out.println("谈dadanzi");
    }
    public void fly (){
        System.out.println("救人");
    }
}

