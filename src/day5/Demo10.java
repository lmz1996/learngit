package day5;

import java.util.Scanner;

public class Demo10 {
	/*��ҵ
	 * �������(������������е�ÿһ��Ԫ��)
	 * �����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
	 * ����Ԫ������ (���ǰ�Ԫ�ضԵ�)
	 * ������(���ݼ���¼������,���Ҷ�Ӧ����)
	 * ����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
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
//		System.out.println("��ȡ�������ֵΪ:"+max);

//		int min = getMin(arr);
//		System.out.println("��ȡ������СֵΪ:"+min);

		//����Ԫ������ (���ǰ�Ԫ�ضԵ�)���Ҵ�ӡ
//		getReverse(arr);
//		print(arr);

//		char[] array ={' ','1','2','3','4','5','6','7'};
//		Scanner sc = new Scanner(System.in);
//		int week = sc.nextInt();
//		if(week < 1) {
//			System.out.println("������һ���ߵ���������������");
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
		// ����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		for (int i = 0;i < arr.length;i++) {
			if(arr[i] == week) {
				System.out.println(i);
			}
		}
		
	}

	private static void getWeek(char[] arr,int num) {
		//������(���ݼ���¼������,���Ҷ�Ӧ����)
		char week =arr[num];
		System.out.println("��ȡ��ֵΪ:"+week);
	}

	private static void getReverse(int[] arr) {
		//����Ԫ������ (���ǰ�Ԫ�ضԵ�)
		//���ǰ�1��5�Ե� arr[0]=arr[arr.length-1-0]
		//���ǰ�2��4�Ե� arr[1]=arr[arr.length-1-1]
		for (int i = 0;i < arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1 -i];
			arr[arr.length-1 -i] = temp;
		}
	}

	private static int getMin(int[] arr) {
		//�����ȡ���ֵ
		int min =arr[0];
		for (int i = 1;i < arr.length;i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;		
	}

	public static void print(int[] arr) {
		//���ݱ�������ӡ
		for (int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int getMax(int[] arr) {
		//�����ȡ���ֵ
		int max =arr[0];
		for (int i = 1;i < arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
}
