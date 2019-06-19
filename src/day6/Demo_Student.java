package day6;

public class Demo_Student {
    public static void main(String[] args){
        Student student = new Student();
        student.name = "li";
        student.age = 22;
        student.study();
        System.out.println("name:"+student.name+",age:"+student.age);
    }
}

class Student {
    String name;

    int age;

    public void study(){
        System.out.println("study dayday up");
    }
    
}
