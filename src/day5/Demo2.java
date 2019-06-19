package day5;

public class Demo2 {
	public static void main(String[] args){
		//获取数组的最值
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 7;
		arr[4] = 5;
		int max = getMaxValue(arr);
		System.out.print(max);

		int min =getMinValue(arr);
		System.out.print(min);

	}
	//获取最大值
	public static int getMaxValue(int[] arr) {
		//一定要用数组中的某个元素开始进行比较
		int max =arr[0];
		for (int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}	
		}
		return max;
	}
	//获取最小值
	public static int getMinValue(int[] arr) {
		int min =arr[0];
		for (int i=1;i<arr.length;i++) {
			if(min > arr[i]) {
				min=arr[i];
			}	
		}
		return min;
	}
}
