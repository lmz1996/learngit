package day5;

public class Demo3 {
	public static void main(String[] args){
		//数组元素反转并且便利
		//1.因为是操作数组所以返回值可以没有就void
		//2.明确参数列表int[] arr
		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		reverseArr(arr);
		print(arr);

	}

	public static void reverseArr(int[] arr) {
		//arr[0]和arr[length-1]
		//arr[1]和arr[length-1-1]
		//arr[2]和arr[length-1-2]
		for(int i = 0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}

	public static void print(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
