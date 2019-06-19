package day6;

public class Demo_phone {
    public static void main(String[] args){
        Phone phone =new Phone();
        phone.setBrand("华为P30");
        phone.setPrice(4300);
        System.out.println("手機中最好的品牌是:"+phone.getBrand()+"價格為:"+phone.getPrice());
        phone.fly();
    }
}
