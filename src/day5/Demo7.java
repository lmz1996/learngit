package day5;

public class Demo7 {
	/*
	 * 二维数组的求和
	 */
	public static void main(String[] args){
//		int[][] arr = new int[3][2];
		int[][] arr = {{1,2,3},{4,5},{6,7}};
//		int sum =getSum(arr);
//		System.out.println(sum);
		getSumArr(arr);
	}
	
//	public static int getSum(int[][] arr) {
//		int sum =0;
//		for (int i = 0;i < arr.length;i++) {
//			for (int j = 0;j < arr[i].length;j++) {
//				sum =sum + arr[i][j];
//			}
//		}
//		return sum;
//	}

	public static void getSumArr(int[][] arr) {
		for (int i = 0;i < arr.length;i++) {
			int sum =0;
			for (int j = 0;j < arr[i].length;j++) {
				sum =sum + arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(sum);
			System.out.println();
		}
	}
}
