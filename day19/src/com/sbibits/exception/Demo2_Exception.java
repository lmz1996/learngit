package com.sbibits.exception;

public class Demo2_Exception {
/*
 *  try...catch�ķ�ʽ�������쳣,�����catchʱ��һ��catch�˾Ͳ���������catch��ֱ������TryCatch��
    ����쳣����̫����ô����дһ��Exception����������쳣�ĸ��ࡣ�൱�ڸ��������������Exception e = new ArithmeticException����;
    try������������catch��С���쳣��ǰ�����쳣�ź��档���ݶ�̬��ԭ�������ķ���ǰ��,�ͻὫ���е����������պ����catch��û��������
    javaEE,����˿�����һ���ǵײ㿪�����ӵײ������ס�
 */
    public static void main(String[] args) {
//        demo1();
        /*
         * JDK7�Ժ������쳣�ķ�ʽ��ע������
            jdk7���˸���|)����һ���������쳣�м����һ�����ߣ����ǲ��á�������ֱ���׳�һ��exception
         */
        Demo1 demo = new Demo1();
        try {
            int div = demo.div(10, 0);
            int[] arr = { 1, 3, 4 };
            int a = arr[5];// Խ���쳣
        } catch (ArithmeticException |ArrayIndexOutOfBoundsException a) {
            System.out.println("exception");
        } catch (Exception e) {
            System.out.println("������");
        }
    }

    private static void demo1() {
        Demo1 demo = new Demo1();
        try {
            int div = demo.div(10, 0);
            int[] arr = { 1, 3, 4 };
            int a = arr[5];// Խ���쳣
        } catch (ArithmeticException a) {
            System.out.println("��������Ϊ0");
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("����Խ����");
        } catch (Exception e) {
            System.out.println("������");
        }
    }

}

class Demo1 {
    public int div(int a, int b) {
        int num = a / b;
        return num;
    }
}