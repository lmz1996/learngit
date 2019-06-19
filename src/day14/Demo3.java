package day14;

public class Demo3 {
    /*A:Greedy 数量词 
    * X? X，一次或一次也没有  X代表任意字符
    * X* X，零次或多次包括一次
    * X+ X，一次或多次
    * X{n} X，恰好 n 次 
    * X{n,} X，至少 n 次 
    * X{n,m} X，至少 n 次，但是不超过 m 次 
    */
    public static void main(String[] args) {
//        demo_1();
        String regex = "[abc]*";
        System.out.println("".matches(regex));
        System.out.println("abc".matches(regex));//多次
        System.out.println("a".matches(regex));

    }

    private static void demo_1() {
        String regex = "[abc]?";//代表a,b,c出现一次或者一次都没有(只针对a,b,c不针对其他的)
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("".matches(regex));//一次也没有
        System.out.println("d".matches(regex));
    }

}
