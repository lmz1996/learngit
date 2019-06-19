package day16;

import java.util.ArrayList;

public class Demo8 {
    /*
     * B:? extends E 向下限定，E及其子类 
     * C:? super E 向上限定，E及其父类
     */
    public static void main(String[] args) {
        // A:泛型通配符<?>
        // * 任意类型，如果没有明确，那么就是Object以及任意的Java类了
        // ArrayList<?> list = new ArrayList<Person>();
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("张三",20));
        personList.add(new Person("李四",21));
        personList.add(new Person("王五",22));
        personList.add(new Person("赵六",23));
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("陈七",24));
        studentList.add(new Student("王八",24));
        studentList.add(new Student("宫九",24));
        personList.addAll(studentList);//子類泛型的可以往父類裡面add
        System.out.println(personList);
        

    }

}
