package day5;

public class Demo9 {
	//基本数据类型的值传递,不改变原值,因为调用成功后就会弹栈，局部变量随之消失(int)
	//引用数据类型的值传递，改变原值，因为即使方法弹栈，可以通过地址继续访问(int[] arr)
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		change(a,b);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println(c);

		int[] arr ={1,2,3};
		System.out.println("传值前"+arr[1]);
		change(arr);
		//即使方法弹栈，可以通过地址继续访问
		System.out.println("传值后"+arr[1]);
		
	}
	
	public static void change(int a,int b) {
		a = b;
		b = 2*b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		
	}

	public static void change(int[] arr) {
		for (int i = 0;i<arr.length;i++) {
			System.out.println(arr[1]);
			arr[1] = 55;
			System.out.println(arr[1]);
			break;
		}
	}
}
