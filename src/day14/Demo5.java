package day14;

import java.util.Arrays;

public class Demo5 {
    /*
     * 把给定字符串数字排序"50,10,55,25,30"
     */
    public static void main(String[] args) {
        String s = "50 10 55 25 30";
        String[] sArr = s.split(" ");
        int[] array = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            array[i] = Integer.parseInt(sArr[i]);
        }
        Arrays.sort(array);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            } else {
                sb.append(array[i] + " ");
            }
        }
        System.out.println(sb);

    }

}
