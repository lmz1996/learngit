package day5;

import java.util.Scanner;

/*
 * 数据元素查找根据录入的值来返回它的索引
 * 1.返回值类型 int
 * 2.参数列表int[] arr,int value
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
				System.out.println("您的数据不存在检查输入信息是否正确");
				break;
			}
		}
		//输入的值在我们的数组里面不存在就返回-1;
		return -1;
	}

	
}
