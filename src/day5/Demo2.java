package day5;

public class Demo2 {
	public static void main(String[] args){
		//��ȡ�������ֵ
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 7;
		arr[4] = 5;
		int max = getMaxValue(arr);
		System.out.print(max);

		int min =getMinValue(arr);
		System.out.print(min);

	}
	//��ȡ���ֵ
	public static int getMaxValue(int[] arr) {
		//һ��Ҫ�������е�ĳ��Ԫ�ؿ�ʼ���бȽ�
		int max =arr[0];
		for (int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}	
		}
		return max;
	}
	//��ȡ��Сֵ
	public static int getMinValue(int[] arr) {
		int min =arr[0];
		for (int i=1;i<arr.length;i++) {
			if(min > arr[i]) {
				min=arr[i];
			}	
		}
		return min;
	}
}
