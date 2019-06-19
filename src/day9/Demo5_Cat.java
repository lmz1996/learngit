package day9;

public class Demo5_Cat extends Demo5_Animals implements Demo5_jump {

    public Demo5_Cat() {

    }

    public Demo5_Cat(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("cat like eat fish");

    }

    @Override
    public void sleep() {
        System.out.println("cat sleep on the floor");

    }

    @Override
    public void jump() {
        System.out.println("teach cat can jump");

    }

}
