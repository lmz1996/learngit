package day9;

public class Demo2 {

    public static void main(String[] args) {
        People1 people = new SuperMan1();//父类引用指向子类对象就是向上转型
        System.out.println(people.name);
        people.method();
        //一定要先有向上转型然后在向下转型
        SuperMan1 sm1 = (SuperMan1)people;//向下转型
        sm1.fly(); //必须向下转型才能调用 
        

    }
}

class People1 {
     String name = "man";

    public void method (){
        System.out.println("谈生意");
    }
}

class SuperMan1 extends People1{
    //方法重新
    public void method (){
        System.out.println("谈dadanzi");
    }
    public void fly (){
        System.out.println("救人");
    }
}

