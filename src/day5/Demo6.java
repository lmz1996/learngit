package day5;

public class Demo6 {
	/*
	 * ��ά����ı���
	 * ��ѭ�����Ƕ�ά����ĳ���,��ʵ����һά����ĸ���
	 * ��ѭ�����Ƶ��Ƕ�ά����ĳ���
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
