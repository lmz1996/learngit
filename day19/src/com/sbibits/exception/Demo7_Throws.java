package com.sbibits.exception;

public class Demo7_Throws {

    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(-17);//��setAge�ķ���������У��1��100
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
//���˭Ҫ�ǵ�����һ�����쳣�ķ���,��ô������Ҳ��Ҫ����,Ҫôtry catchҪô�׳��쳣
    public void setAge(int age) throws Exception {
        if (age >0 && age < 100) {
            this.age = age;
        } else {
            //��Ȼ����������������쳣����ô�Ҿ���Ҫ�ڷ���������һ������,����������������ܳ�������
            throw new Exception("��������");
//            Exception e = new Exception("��������");
//            throw e;
        }
        
    }

}