package test;

public class Demo14_Continue {
/*
 * Java���Ի���(������ת���continue���)
* A:continue��ʹ�ó���
    * ֻ����ѭ����
 */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                continue;//��ֹ����ѭ��,�����´�ѭ���������½�����,ֱ����һ��ѭ��
            }
            System.out.println(i);
        }

    }

}
