package day9;

public abstract class Demo5_Animals {
    private String name;
    private int age;

    public abstract void eat();

    public abstract void sleep();

    public Demo5_Animals() {

    }

    public Demo5_Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
