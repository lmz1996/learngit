package day9;

public class Demo4 {

    public static void main(String[] args) {
        SeniorStudent seniorStudent = new SeniorStudent();
        seniorStudent.setName("����");
        seniorStudent.setAge(20);
        seniorStudent.study();
        System.out.println(seniorStudent.getName() + "����" + seniorStudent.getAge());
        UniversityStudent universityStudent = new UniversityStudent("lisi", 20, "manager");
        System.out.println(universityStudent.getName() + "����" + universityStudent.getAge()+universityStudent.getWork());
        universityStudent.study();
    }
}

abstract class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public abstract void study();
}

class SeniorStudent extends Student {

    public SeniorStudent() {

    }

    public SeniorStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("Ŭ��ѧϰ");

    }

}

class UniversityStudent extends Student {
    private String work;

    public UniversityStudent() {

    }

    public UniversityStudent(String name, int age, String work) {
        super(name, age);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void study() {
        System.out.println("����ôѧϰ");

    }

}