package day10;

public class Demo_4 {

    public static void main(String[] args) {
        Demo_Person dp = new Demo_Person();
        dp.method(new Person() {  //匿名内部类当做参数传递（本质把内部类当做是一个对象）

            @Override
            public void print() {
                System.out.println("aaa");

            }

        });
    }

}
//这里写抽象类接口都行
abstract class Person {
    public abstract void print();
}

class Demo_Person {
    public void method(Person p) {
        p.print();
    }
}