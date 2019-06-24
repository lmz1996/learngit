package test;

public class Demo15_Mark {
/*
 * Java语言基础(控制跳转语句标号)
* 标号:标记某个循环对其控制,一般用于多层循环想要跳到指定循环(多用于跳转到外部循环)
* 标号组成规则:其实就是合法的标识符
 */
    public static void main (String[] args){
//        outer:for (int i=1;i<10;i++) {
//            System.out.println(i);
//            inner:for(int j = 1;j<10;j++) {
//                System.out.println(j);
////                break;//跳出当前这一层的循环 11 21 31 41 51 61...
//                break outer;//用标号跳转到了指定的循环11
//            }
//        }
        System.out.println("hello");
        HTTP://www.baidu.com                //之所以没报错是因为前面HTTP:是一个标号后面的被//注释了所以并没有实际意义
            System.out.println("world");
    }
}
