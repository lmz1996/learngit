package test;

public class Demo9_DoWhile {
/** A:ѭ���ṹdo...while���ĸ�ʽ��
* 
        do {
            ѭ�������;
        }while(�ж��������);
        
        ������ʽ��
        ��ʼ�����;
        do {
            ѭ�������;
            �����������;
        }while(�ж��������);
* B:ִ�����̣�
    * a:ִ�г�ʼ�����
    * b:ִ��ѭ�������;
    * c:ִ�п����������
    * d:ִ���ж��������,���䷵��ֵ��true����false
        * �����true���ͼ���ִ��
        * �����false���ͽ���ѭ��
    * e:�ص�b������
* C:������ʾ
    * �������ڿ���̨�������1-10
    */
    public static void main(String[] args) {
        // �������ڿ���̨�������1-10
        int i = 1;
        do {
            System.out.println("i=" + i);
            i++;
        } while (i <= 10);
        System.out.println("---------------------------");
        int j = 11;
        do {
            System.out.println("j=" + j);
            j++;
        } while (j <= 10);
    }

}
