package day5;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args){
		//根据键盘输入的索引来查询对应星期数
		char[] arr ={' ','一','二','三','四','五','六','七'};
		Scanner sc = new Scanner(System.in);
		int week =sc.nextInt();
		if(week < 1) {
			System.out.println("请输入一到七的数字请重新输入");
			int week1 =sc.nextInt();
			getWeek(arr,week1);
		} else {
			getWeek(arr,week);
		}
		

	}

	public static void getWeek(char[] arr,int num) {
		char week =arr[num];
		System.out.println("today is:星期"+week);
	}
	
}
