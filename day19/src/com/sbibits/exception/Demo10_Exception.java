package com.sbibits.exception;

public class Demo10_Exception {

    public static void main(String[] args) throws Exception {
        //˭����Exception������ô�˷�����Ҫ��Ҫ�׳��쳣,RunTimeException����ǿ����Ҫ
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

    // ���˭Ҫ�ǵ�����һ�����쳣�ķ���,��ô������Ҳ��Ҫ����,Ҫôtry catchҪô�׳��쳣
    public void setAge(int age) throws Exception {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
             throw new AgeOutOfBoundsException("������");
        }

    }

}
//ֻ��Ҫ�̳�,�����ʵ�ֶ��ɸ�������,ֻ��Ϊ���Զ����쳣����ͨ���������ֵ�����ʲô�쳣,����ԵĽ���취
class AgeOutOfBoundsException extends Exception {
    public AgeOutOfBoundsException() {

    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}