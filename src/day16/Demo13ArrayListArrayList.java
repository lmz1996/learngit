package day16;

import java.util.ArrayList;

public class Demo13ArrayListArrayList {
//集合嵌套之ArrayList嵌套ArrayList
    /*
     * 案例:
     * 我们学科，然后学科有分成若干个班级
     * 整个学科是一个大的集合，若干个班级分成每一个小集合，小集合里面是人
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Person>> list = new ArrayList<>();
        ArrayList<Person> firstClass = new ArrayList<Person>();//创建第一个班级
        //往班级里面加人
        firstClass.add(new Person("张三",20));
        firstClass.add(new Person("李四",21));
        firstClass.add(new Person("王五",22));
        ArrayList<Person> secondClass = new ArrayList<Person>();
        secondClass.add(new Person("张飞",20));
        secondClass.add(new Person("关羽",21));
        secondClass.add(new Person("赵云",22));
        //将班级添加到学科的集合中
        list.add(firstClass);
        list.add(secondClass);
        //遍历学科集合
        for(ArrayList<Person> classGroup:list){
            //遍历班级
            for(Person people:classGroup){
               System.out.println(people); 
            }
        }
    }

}
