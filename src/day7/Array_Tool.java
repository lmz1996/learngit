package day7;

public class Array_Tool {
    /*
     * �������е����ֵ 
     * ��������
     * reverse����
     */
    // ���һ���������еķ������Ǿ�̬�ģ���Ҫ�ڶ���һ��,˽�й��췽��Ϊ�˲����������ഴ��������
    // ֱ������.����
    private Array_Tool() {
    }

    // �������е����ֵ
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // ��������
    public static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //reverse����
    public static void reverseArr(int[] arr) {
        //arr[0]��arr[arr.length-1]����
        //arr[1]��arr[arr.length-1-1]����
        //����:arr[i]��arr[arr.length-1-i]����
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
