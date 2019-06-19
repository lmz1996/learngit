package day5;

import java.util.Scanner;

public class Demo10 {
	/*作业
	 * 数组遍历(依次输出数组中的每一个元素)
	 * 数组获取最值(获取数组中的最大值最小值)
	 * 数组元素逆序 (就是把元素对调)
	 * 数组查表法(根据键盘录入索引,查找对应星期)
	 * 数组元素查找(查找指定元素第一次在数组中出现的索引)
	 */
	public static void main(String[] args){
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 6;
		arr[3] = 4;
		arr[4] = 5;
//		print(arr);
//		int max = getMax(arr);
//		System.out.println("获取到的最大值为:"+max);

//		int min = getMin(arr);
//		System.out.println("获取到的最小值为:"+min);

		//数组元素逆序 (就是把元素对调)并且打印
//		getReverse(arr);
//		print(arr);

//		char[] array ={' ','1','2','3','4','5','6','7'};
//		Scanner sc = new Scanner(System.in);
//		int week = sc.nextInt();
//		if(week < 1) {
//			System.out.println("请输入一到七的数字请重新输入");
//			int week1 =sc.nextInt();
//			getWeek(array,week1);
//		} else {
//			getWeek(array,week);
//		}

		int[] arr1 ={1,2,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		getIndex(week,arr1);
	}

	private static void getIndex(int week,int[] arr) {
		// 数组元素查找(查找指定元素第一次在数组中出现的索引)
		for (int i = 0;i < arr.length;i++) {
			if(arr[i] == week) {
				System.out.println(i);
			}
		}
		
	}

	private static void getWeek(char[] arr,int num) {
		//数组查表法(根据键盘录入索引,查找对应星期)
		char week =arr[num];
		System.out.println("获取的值为:"+week);
	}

	private static void getReverse(int[] arr) {
		//数组元素逆序 (就是把元素对调)
		//就是把1和5对调 arr[0]=arr[arr.length-1-0]
		//就是把2和4对调 arr[1]=arr[arr.length-1-1]
		for (int i = 0;i < arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1 -i];
			arr[arr.length-1 -i] = temp;
		}
	}

	private static int getMin(int[] arr) {
		//数组获取最大值
		int min =arr[0];
		for (int i = 1;i < arr.length;i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;		
	}

	public static void print(int[] arr) {
		//数据遍历并打印
		for (int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int getMax(int[] arr) {
		//数组获取最大值
		int max =arr[0];
		for (int i = 1;i < arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
}
