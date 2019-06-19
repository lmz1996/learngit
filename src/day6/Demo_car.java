package day6;

public class Demo_car {
    public static void main(String[] args){
        //当一个对象想要实例多次时候可以用匿名对象
//        Car car1 =new Car();
//        car(car1);
//
//        Car car2 =new Car();
//        car(car2);
//
//        Car car3 =new Car();
//        car(car3);
//
//        Car car4 =new Car();
//        car(car4);
        //这样子代码量很大可以用匿名对象,也就是想要有多少就写多少个就行
        car(new Car());
        car(new Car());
        car(new Car());
        car(new Car());
    }
                            //对于下面就相当于Car cc = new Car();
    public static void car (Car cc) {
        cc.price=120;
        cc.color="red";
        cc.run();
        System.out.println(cc.price+"..."+cc.color);
        
    }
}

class Car {
    String color;

    int price;

    public void run(){
        System.out.println("能跑");
    }
    
}
