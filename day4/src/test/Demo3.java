package test;

public class Demo3 {
/*
 *  A:������ʾ
    * �������1-10֮������֮��
    * ����:0+1
    *     1+2
    *     3+3
    *     .....
*   B:ѧ����ϰ
    * �������1-100֮��ż����
    * �������1-100֮��������
 */
    public static void main(String[] args) {
        int sum =0;
        for (int i=1;i<=10;i++) {
             sum = sum + i;
        }
        System.out.println(sum);
    }

    
}
