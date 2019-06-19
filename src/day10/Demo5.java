package day10;

public class Demo5 {
    // Demo_Outer.method().print()
    public static void main(String[] args) {
        Inner i = Demo_Outer.method();
        i.print();
    }

}

interface Inner {
    abstract void print();
}

class Demo_Outer {
    public static Inner method() {
        return new Inner() {
            public void print() {
                System.out.println("print");
            }
        };
    }
}
