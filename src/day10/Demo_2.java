package day10;

public class Demo_2 {
    /*
     * 靜態內部類的實例放發 :  外部类名.内部类名 对象名 = 外部类名.内部类对象
     * 正常思维 Outer.Inner oi = Outer.new Inner();
     * 但是需要写成 Outer.Inner oi = new Outer.Inner();
     */
    public static void main(String[] args) {
        //靜態內部類
        Outer1.Inner1 oi = new Outer1.Inner1();
        oi.show();
        //靜態內部類中的靜態方法
        Outer1.Inner1.print();
    }

}
class Outer1 {
    static class Inner1 {
        public void show() {
            System.out.println("展示");
        }
        
        public static void print() {
            System.out.println("打印");
        }
    }
    
}
