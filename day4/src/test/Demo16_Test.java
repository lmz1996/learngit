package test;

public class Demo16_test {
/*
 * * A:练习题,补全程序达到目的
        我想在控制台输出2次:“Java基础班“
        我想在控制台输出7次:“Java基础班“
        我想在控制台输出13次:“Java基础班“   
 */
    public static void main(String[] args) {
        for(int x=1; x<=10; x++) {
            if(x%3==0) {
                //在此处填写代码
//                break;   //我想在控制台输出2次:“Java基础班“
//                continue;//我想在控制台输出7次:“Java基础班“
                System.out.println("Java基础班");
            }
            System.out.println("Java基础班");  //我想在控制台输出13次:“Java基础班“ 
        }

    }

}
