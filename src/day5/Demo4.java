package day5;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args){
		//���ݼ����������������ѯ��Ӧ������
		char[] arr ={' ','һ','��','��','��','��','��','��'};
		Scanner sc = new Scanner(System.in);
		int week =sc.nextInt();
		if(week < 1) {
			System.out.println("������һ���ߵ���������������");
			int week1 =sc.nextInt();
			getWeek(arr,week1);
		} else {
			getWeek(arr,week);
		}
		

	}

	public static void getWeek(char[] arr,int num) {
		char week =arr[num];
		System.out.println("today is:����"+week);
	}
	
}
