package day7;

public class Demo1_employee {
    public static void main(String[] args) {
        Employee employee = new Employee("������", 100, 10000);
        employee.show();

        Employee employee1 = new Employee();
        employee1.setName("����");
        employee1.setAge(23);
        employee1.setSalary(20000);
        System.out.println(
                "name:" + employee1.getName() + ",age:" + employee1.getAge() + ",salary:" + employee1.getSalary());
    }

}

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() { // �޲εĹ��췽��
    }

    public Employee(String name, int age, double salary) { // �вεĹ��췽��
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void show() {
        System.out.println("name:" + name + ",age:" + age + ",salary:" + salary);
    }
}
