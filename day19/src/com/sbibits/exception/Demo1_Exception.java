package com.sbibits.exception;

public class Demo1_Exception {
    /*
     * try����������쳣�� catch:�����������쳣�� finally:�ͷ���Դ���ر�IO��
     */
    /*
     * A:�쳣��������ַ�ʽ a:try��catch��finally try catch try catch finally try finally
     * b:throws B:try...catch�����쳣�Ļ�����ʽ try��catch��finally C:������ʾ
     * try...catch�ķ�ʽ����1���쳣
     */
    public static void main(String[] args) {
        Demo demo = new Demo();
        try{
            int div = demo.div(10, 0);
            System.out.println(div);
        }catch (ArithmeticException a) {
           System.out.println("�����˷����쳣��");
        }
        System.out.println(111);//��Ȼ�����쳣����catch�����쳣�˻��ǿ��Լ���ִ��
    }

}
class Demo {
    public int div(int a,int b){
        int num = a/b;
        return num;
    }
}