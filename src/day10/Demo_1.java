package day10;

public class Demo_1 {

    public static void main(String[] args) {
//         Outer.Inner inner = new Outer().new Inner();
        // inner.print();
        Outer o = new Outer();
        o.print();
    }

}

class Outer {
    private int age = 20;

    private class Inner {
        private String name;

    }

    public void print() {
        Inner i = new Inner();
        System.out.println(this.age);
    }
}
