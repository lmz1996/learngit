package test;

public class Demo5 {
/*
 * �����ڿ���̨������еġ�ˮ�ɻ�����
    * ��ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ���������
    * ������153����һ��ˮ�ɻ�������λ�������ͼ���10λ�������ͼ��ϸ�λ��������
    * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
 */
/*
 * ����:
 * 1:100~999
 * 2:��ȡÿһ��λ����ֵ,��λʮλ��λ
 * 3:�жϸ���λ���ϵ��������Ƿ���������,������ڴ�ӡ
 */
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10; // 153 % 10��3
            int shi = i / 10 % 10; // 153/10����15.3��ʵ����15������������������%10��5
            int bai = i / 10 / 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
        }

    }

}