package com.sbibits.exception;

public class Demo6_Throwable {
    /*A:Throwable�ļ�����������
    * a:getMessage()
        * ��ȡ�쳣��Ϣ�������ַ�����
    * b:toString()
        * ��ȡ�쳣�������쳣��Ϣ�������ַ�����
    * c:printStackTrace()
    * ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid��
    */
    public static void main(String[] args) {
        try {
            System.out.println(1/0);//1/0�ᷢ����0�쳣
        } catch (Exception e) {
       //�������쳣��ʱ���൱��Exception e = new ArithmeticException("/ by zero");����eһ����ֵַ
//            System.out.println(e.getMessage());//��ȡ�쳣��Ϣ,�����ַ�����

//            System.out.println(e.toString());//��������e��дtoString����Ĭ�ϸ������
            //e.toString()��ȡ�쳣�������쳣��Ϣ�������ַ�����

            //��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid��
            e.printStackTrace();//jvmĬ�ϴ����쳣�ķ�ʽ
        }

    }

}
