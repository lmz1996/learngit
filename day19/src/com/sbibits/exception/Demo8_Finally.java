package com.sbibits.exception;

public class Demo8_Finally {
/*
 * :finally���ص�
    * ��finally���Ƶ������һ����ִ��
    * �����������ִ�е�finally֮ǰjvm�˳���(����System.exit(0))
    * System.exit(0)�˳�java�����,����Ψһһ����ִ��finally�����
 * B:finally������
    * �����ͷ���Դ����IO�����������ݿ�����л����
 * C:������ʾ
    * finally�ؼ��ֵ��ص㼰����
 */
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("������");
            return;
            // return��������ǰ�ķ���,��ôΪʲô�Ҽ���return�˻��ǻᵽfinally���ء�
            // ��Ϊreturn���Կ���������������һ����,��ôfinally��������������Ը,����ȥ����finally������ʲô�Ĺ�û��
      //����оͽ�finallyִ���귵��
        } finally {
            // ����catch�������return,finallyҲ��ִ��
            System.out.println("�ұ���ִ��");
            // ��finally���Ƶ������һ����ִ��,�����ͷ���Դ����IO�����������ݿ�����л����
        }
        System.out.println("end");

    }

}
