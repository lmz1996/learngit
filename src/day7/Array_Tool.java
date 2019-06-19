package day7;

public class Array_Tool {
    /*
     * 求数组中的最大值 
     * 便利数组
     * reverse数组
     */
    // 如果一个类中所有的方法都是静态的，需要在多做一步,私有构造方法为了不让其他的类创建本对象
    // 直接类名.即可
    private Array_Tool() {
    }

    // 求数组中的最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // 遍历数组
    public static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //reverse数组
    public static void reverseArr(int[] arr) {
        //arr[0]和arr[arr.length-1]互换
        //arr[1]和arr[arr.length-1-1]互换
        //规律:arr[i]和arr[arr.length-1-i]互换
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
