package day6;

public class Demo_car {
    public static void main(String[] args){
        //��һ��������Ҫʵ�����ʱ���������������
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
        //�����Ӵ������ܴ��������������,Ҳ������Ҫ�ж��پ�д���ٸ�����
        car(new Car());
        car(new Car());
        car(new Car());
        car(new Car());
    }
                            //����������൱��Car cc = new Car();
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
        System.out.println("����");
    }
    
}
