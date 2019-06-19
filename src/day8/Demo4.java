package day8;

/*
 * 执行顺序如下
 * 首先jvm调用了main方法main方法进栈
 * 遇到了Bmw bmw = new Bmw()会将Car.class和Bmw.class分别加载到内存中,
 * 随着class文件加载到内存中静态代码块会输出,
 * 因此第一个输出父类的静态代码块，第二个输出子类的静态代码块
 * 当class加载到了内存之后就会创建对象,调用了Bmw的构造方法
 * 但是子类的构造方法的第一行必须是隐藏的super方法，所以每当创建一个对象都必须调用下父类的无参构造方法
 * 因此会先到父类，但是由于到了父类中，构造代码块优先于构造方法执行
 * 第三个输出父类的构造代码块，第四个输出父类的构造方法
 * 当父类初始化完成后才会初始化子类
 * 因此第五个输出子类的构造方法块，第六个输出子类的构造方法
 */
public class Demo4 {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
    }
}

class Car {
    static {
        System.out.println("父类的静态代码块");
    }

    {
        System.out.println("父类的构造代码块");
    }

    public Car() {
        System.out.println("父类的构造方法");
    }
}

class Bmw extends Car{
    static {
        System.out.println("子类的静态代码块");
    }

    {
        System.out.println("子类的构造代码块");
    }

    public Bmw() {
        System.out.println("子类的构造方法");
    }
}