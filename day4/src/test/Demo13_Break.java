package test;

public class Demo13_Break {
/*
 * Java���Ի���(������ת���break���)
* A:break��ʹ�ó���
    * ֻ����switch��ѭ����д�ڱ��λ�ñ���,break��������ѭ��
 */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                break;//��ǰ����ѭ��
            }
            System.out.println(i);
        }

    }

}
