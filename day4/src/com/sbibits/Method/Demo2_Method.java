package com.sbibits.Method;

public class Demo2_Method {
/*
 * * A:���дһ������
    * 1,��ȷ����ֵ����
    * 2,��ȷ�����б� 
     B:������ʾ
    * ��������������֮�͵İ���
    *C:��������ͼ��
 */
    public static void main(String[] args) {
//        ����������֮�͵İ���
//        int a = 10;
//        int b = 10;
//        int sum = a +b;
//        System.out.println(sum);
//
//        int a1 = 10;
//        int b1 = 10;
//        int sum1 = a1 +b1;
//        System.out.println(sum1);//�ɴ˿��Կ���������ǲ��÷����Ļ������Ҫ�������ӻ�Ҫ���¶���,����ĸ�����̫��
      //10,30��ʵ��
        int sum = add(10,30);                  //step1:����add������10,30�ֱ𴫵ݸ�a,b
                                               //step5:�������Ľ�����ظ�sum
        int sum1 = add(40,30);
        System.out.println(sum);
        System.out.println(sum1);
    }
    /*
     * �����������ĺ�
     * 1:��ȷ����ֵ����(�����ĺ�Ӧ�û���������ô����ֵ���;���int)
     * 2:��ȷ�����б�������int��
     * 3:���
     * 4:����
     */
    public static int add(int a, int b) {//step2:��ֵa=10,b=30.a,b���β�
        int sum = a + b;           //step3:ִ������a��b��Ӹ�ֵ��sum
        return sum;//step4:ͨ��return��sum�Ľ������
    }

}
