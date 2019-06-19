package day8;

public class Demo3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        int a = 5;
        Dog dog1 = new Dog(a);
        //因为实例化一次就会调用一次构造方法所以super调用了两次父类的无参构造方法
    }
}

class Animals {
    public Animals() {
        System.out.println("父类");
    }
}

class Dog extends Animals {
    // 子类每访问一次构造方法都会去先访问父类的无参构造方法,因为构造方法中默认调用super()方法,
    // 会调用父类的构造方法,只有父类初始化完事后才会初始化子类
    public Dog() {
        //super();这个super()方法是不需要写的自带的调用父类的。父类中也有一个隐藏的super，
        //父类的super调用的是Object
        System.out.println("子类");
    }

    public Dog(int a) {
      //super();
        System.out.println("子类" + a + "岁");
    }
}
