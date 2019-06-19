package day7;

public class Demo_Array_Tool {
    public static void main(String[] args) {
        int[] arr ={5,2,3,7,8};
        int max = Array_Tool.getMax(arr);
        System.out.println(max);
        System.out.println("==================");
        Array_Tool.array(arr);
        System.out.println();
        System.out.println("==================");
        Array_Tool.reverseArr(arr);
        Array_Tool.array(arr);
    }
    
}
