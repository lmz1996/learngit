package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo5 {
    /* A:泛型概述
    * B:泛型好处
        * 提高安全性(将运行期的错误转换到编译期) 
        * 省去强转的麻烦
    * C:泛型基本使用
        * <>中放的必须是引用数据类型 
    * D:泛型使用注意事项
        * 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)
        */
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",20));
        list.add(new Person("李四",21));
        Iterator<Person> it = list.iterator();
        while(it.hasNext()){
            Person p =it.next();//因为加了泛型所有不用强转
            //Person p = (Person)it.next();
            System.out.println(p.getName()+"..."+p.getAge());
        }

    }

}
