package day9;

public class Demo5_Dog extends Demo5_Animals implements Demo5_jump {
    public Demo5_Dog() {

    }

    public Demo5_Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("teach dog can jump more higher");

    }

    @Override
    public void eat() {
        System.out.println("cat like eat meat");

    }

    @Override
    public void sleep() {
        System.out.println("dog like sleep on its owner's leg");

    }

}
