package com.sbibits.exception;

public class Demo10_Exception {

    public static void main(String[] args) throws Exception {
        //谁调用Exception的类那么此方法需要需要抛出异常,RunTimeException不是强制需要
        Student student = new Student();
        try {
            student.setAge(-17);
        } catch (AgeOutOfBoundsException a) {
            a.printStackTrace();
        }
                

    }

}

class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
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

    // 如果谁要是调用了一个有异常的方法,那么调用者也需要处理,要么try catch要么抛出异常
    public void setAge(int age) throws Exception {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
             throw new AgeOutOfBoundsException("出错了");
        }

    }

}
//只需要继承,具体的实现都由父类来做,只是为了自定义异常可以通过名字区分到底是什么异常,有针对的解决办法
class AgeOutOfBoundsException extends Exception {
    public AgeOutOfBoundsException() {

    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}