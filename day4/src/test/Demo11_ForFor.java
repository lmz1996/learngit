package test;

public class Demo11_ForFor {
    /*
     * ������������е���״
     *
     **
     ***
     ****
     *****
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {//��ѭ����������
            for (int j = 1; j <= i; j++) {//��ѭ����������
                System.out.print("*");
            }
            System.out.println();//����
        }

    }

}