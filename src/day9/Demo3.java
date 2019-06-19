package day9;

public class Demo3 {
/*
 * 多态的好处和弊端
 * a:提高了代码的维护性（继承保证)
 * b:提高了代码的扩展性（由多态保证）
 * c:可以当做形式参数，可以接受任意子类对象
 * 多态的缺点:
 * 不能使用子类的特有属性还有行为,要想使用就必须要强转
 */
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.eat();                   这样如果多个对象会很麻烦
//        Dog d = new Dog();
//        d.eat();
        method(new Cat());
        method(new Dog());
    }
    //提高了代码的扩展性（由多态保证）
    //可以当做形式参数，可以接受任意子类对象
    public static void method(Animals a) {
        //如果想要使用子类特有的属性那么就需要强转
        //关键字instinseof判断前边的引用是否是后边的数据类型
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
        System.out.println("动物吃东西");
    }
}

class Cat extends Animals{
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animals{
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void lookHouse() {
        System.out.println("看家");
    }
}
