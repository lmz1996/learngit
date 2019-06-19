package day16;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo12 {
//數組裝換成集合
//數組轉換成集合雖然不能增加或者減少元素但是能夠使用集合的其他方法
    public static void main(String[] args) {
//        demo1();
//        demo2();
        //集合轉數組，加上泛型的
        demo3();

    }

    private static void demo3() {
        List<String> arrList = new ArrayList<String>();
        arrList.add("a");
        arrList.add("c");
        arrList.add("d");
        arrList.add("e");
        String[] arr = arrList.toArray(new String[0]);
        //集合轉換成數組的時候，數組的長度如果是小於等於集合的size時候，那麼轉換的長度就是size的長度
        //如果數組的長度大於size，分配的數組長度就和你制定的長度一樣8
        for (String string : arr) {
            System.out.println(string);
            
        }
    }

    private static void demo2() {
        //基本數據類型的數組轉換成集合會將整個數組當做一個對象進行轉換
//        int[] arr = {1,2,3,4,5};
//        List arrList = Arrays.asList(arr);
//        System.out.println(arrList);
      //數組想轉換成集合那麼必須是引用的數據類型
        //如果基本數據類型想轉換成集合那麼就要用它們的對應的包裝類
        Integer[] arr ={1,2,3,4,5};
        List arrList = Arrays.asList(arr);
        System.out.println(arrList);
    }

private static void demo1() {
    String[] arr = {"a","b","c","d"};
    List<String> arrList = Arrays.asList(arr);
//        arrList.add("e");//會出錯
    System.out.println(arrList);
}

}
