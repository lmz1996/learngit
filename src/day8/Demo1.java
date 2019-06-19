package day8;

public class Demo1 {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println("=================");
        Student stu1 = new Student();
        
    }
}

// 构造方法块:每当创建一次对象就会执行一次,优先于构造函数执行
class Student {
    {
        show("构造");
    }
//随着类的加载而加载，且只执行一次
//作用:用来给类进行初始化的,一般用来加载驱动
//优先于主方法执行
static {
        show("静态");
}

    private static void show(String a) {
        System.out.println("我是" + a + "代码块");
    }
}
