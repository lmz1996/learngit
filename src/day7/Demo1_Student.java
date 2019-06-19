package day7;

public class Demo1_Student {
    public static void main(String[] args) {
        Student stu1 = new Student("張三", 24);//有参数构造方法
        stu1.show1();
        Student stu2 = new Student();//无参构造
        stu2.setAge(23);
        stu2.setName("李四");
        show(stu2.getName(), stu2.getAge());
    }

    private static void show(String name, int age) {
        System.out.println(name + "..." + age);
    }

}

class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    
    public void show1() {
        System.out.println("my name is:"+name +",age is:" + age);
    }

}