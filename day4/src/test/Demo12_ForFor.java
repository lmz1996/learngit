package test;

public class Demo12_ForFor {
//�ڿ���̨����žų˷���
    /*
     * ��������һ��˼·
     * 1*1=1
     * 1*2=2 2*2=4
     * ....
     */
    public static void main(String[] args) {
        for (int i = 1;i<=9;i++) {
            for (int j = 1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+(i*j) +"\t");
            }
            System.out.println();
        }

    }

}
