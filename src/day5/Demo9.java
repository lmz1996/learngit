package day5;

public class Demo9 {
	//�����������͵�ֵ����,���ı�ԭֵ,��Ϊ���óɹ���ͻᵯջ���ֲ�������֮��ʧ(int)
	//�����������͵�ֵ���ݣ��ı�ԭֵ����Ϊ��ʹ������ջ������ͨ����ַ��������(int[] arr)
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
		System.out.println("��ֵǰ"+arr[1]);
		change(arr);
		//��ʹ������ջ������ͨ����ַ��������
		System.out.println("��ֵ��"+arr[1]);
		
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
