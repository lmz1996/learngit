package day16;

public class Demo11 {
/* A:�ɱ��������
     * ���巽����ʱ��֪���ö�����ٸ�����
    * B:��ʽ
        * ���η� ����ֵ���� ������(�������͡�  ������){}
    * C:ע�����
        * ����ı�����ʵ��һ������
        * ���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ��
        */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        print(arr);
        //����֪�����ٸ��������ÿɱ�������ݵı�����ʵ����һ������
        show(1,2,3,4,5);

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    private static void show(int x,int ... arr){
        for (int i = 0; i < arr.length; i++) {
//            ���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ��
            System.out.println(x+","+arr[i]);
        }
    }

}
