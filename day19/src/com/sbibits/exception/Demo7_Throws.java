package com.sbibits.exception;

public class Demo7_Throws {

    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(-17);//在setAge的方法中做了校验1到100
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(p.getAge());
    }

}

class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
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
//如果谁要是调用了一个有异常的方法,那么调用者也需要处理,要么try catch要么抛出异常
    public void setAge(int age) throws Exception {
        if (age >0 && age < 100) {
            this.age = age;
        } else {
            //既然你这个方法中是有异常的那么我就需要在方法上面有一个生命,告诉你这个方法可能出现问题
            throw new Exception("发生错误");
//            Exception e = new Exception("发生错误");
//            throw e;
        }
        
    }

}