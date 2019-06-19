package day5;

public class Demo1 {
	public static void main(String[] args){
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		printList(arr);

		int[] arr1 = new int[5];
		arr1[0] = 6;
		arr1[1] = 7;
		arr1[2] = 8;
		arr1[3] = 9;
		arr1[4] = 10;
		printList(arr1);
	}
	
	public static void printList(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
