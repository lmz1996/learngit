package day6;

public class Demo_phone {
    public static void main(String[] args){
        Phone phone =new Phone();
        phone.setBrand("��ΪP30");
        phone.setPrice(4300);
        System.out.println("�֙C����õ�Ʒ����:"+phone.getBrand()+"�r���:"+phone.getPrice());
        phone.fly();
    }
}
