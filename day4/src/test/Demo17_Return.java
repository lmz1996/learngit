package test;

public class Demo17_Return {
/*
 * A:return������
    * ����
    * ��ʵ�������ò��ǽ���ѭ���ģ����ǽ���������
 */
    public static void main(String[] args) {
        for (int i =1; i<20;i++) {
            if(i==4) {
//                break;//break������ǰѭ�������ѭ��������
                return;//ֱ���������������������ѭ��������
            }
        }
        System.out.println("ѭ��������");
    }

}
