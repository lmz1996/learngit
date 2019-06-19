package day5;

public class Demo6 {
	/*
	 * 二维数组的遍历
	 * 外循环就是二维数组的长度,其实就是一维数组的个数
	 * 内循环控制的是二维数组的长度
	 */
	public static void main(String[] args){
//		int[][] arr = new int[3][2];
		int[][] arr = {{1,2,3},{4,5},{6,7}};
		printArr(arr);
		
	}
	
	public static void printArr(int[][] arr) {
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
