package day5;

import java.util.Scanner;

/*
 * ����Ԫ�ز��Ҹ���¼���ֵ��������������
 * 1.����ֵ���� int
 * 2.�����б�int[] arr,int value
 */
public class Demo5 {
	public static void main(String[] args){
	int[] arr = new int[5];
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr[4] = 5;
//	int[] arr1 ={1,2,3,4,5};
	Scanner sc = new Scanner(System.in);
	int value = sc.nextInt();
	int index = getIndex(arr,value);
	System.out.println(index);
	}

	public static int getIndex(int[] arr,int value){
		for(int i = 0;i<arr.length;i++) {
			if (arr[i] == value) {
				return i;
			} else {
				System.out.println("�������ݲ����ڼ��������Ϣ�Ƿ���ȷ");
				break;
			}
		}
		//�����ֵ�����ǵ��������治���ھͷ���-1;
		return -1;
	}

	
}
