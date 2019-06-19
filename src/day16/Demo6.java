package day16;

public class Demo6 {

    public static void main(String[] args) {
//      demo_1();
        //泛型方法
        Tool<String> tool = new Tool<String>();
        tool.show("abc");//show的泛型和類的泛型一致
        tool.print(123);
        tool.show1(true);
    }

    private static void demo_1() {
        //泛型類的使用
            Tool<Person> tool = new Tool<Person>();//相当于给Q的泛型是Person
            tool.setQ(new Person("张三",20));
            System.out.println(tool.getQ());
    }

}
