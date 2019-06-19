package day16;

public class Tool<Q> {
    // 类的泛型一般都是一个字母，E代表element元素T代表type。当然你可以自己定义没有特殊含义的
    private Q q;

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }

    public void show(Q q) { // 在一創建對象的時候就給類的Q賦值了,所以方法泛型最好跟類的泛型一致
        System.out.println(q);
    }

    public<T> void print(T t){//如果不想一致可以自己定義自己方法的泛型
        System.out.println(t);//自己的方法定义泛型，相当于方法拥有了自己的泛型
    }
    public static<Q> void show1(Q q){//静态方法必须声明自己的泛型，因为类的泛型是随着创建对象才被赋值的
        System.out.println(q);//静态方法是编译时就要有的所以不行需要自己定义泛型
    }
}
