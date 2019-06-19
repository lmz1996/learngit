package day5;

public class Demo8 {
	/*
	 * 二维数组的每一个一维数组求和
	 */
	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5},{6,7}};
		getSumArr(arr);
	}

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
