package day16;

import java.util.ArrayList;

public class Demo8 {
    /*
     * B:? extends E �����޶���E�������� 
     * C:? super E �����޶���E���丸��
     */
    public static void main(String[] args) {
        // A:����ͨ���<?>
        // * �������ͣ����û����ȷ����ô����Object�Լ������Java����
        // ArrayList<?> list = new ArrayList<Person>();
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("����",20));
        personList.add(new Person("����",21));
        personList.add(new Person("����",22));
        personList.add(new Person("����",23));
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("����",24));
        studentList.add(new Student("����",24));
        studentList.add(new Student("����",24));
        personList.addAll(studentList);//����͵Ŀ���������e��add
        System.out.println(personList);
        

    }

}
