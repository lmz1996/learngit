package day12;

import java.util.Scanner;

public class Demo_1 {
    // ������ַ����������ַ�������equals�Ƚϣ������ѳ�������ǰ����Ϊ�����п�����null�����Ļ�����ֿ�ָ���쳣
    public static void main(String[] args) {
        demo_1();

    }
 
    private static void demo_1() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("�������û���");
            String userName = sc.nextLine();
            System.out.println("����������");
            String password = sc.nextLine();
            if ("admin".equals(userName) && "admin".equals(password)) {
                System.out.println("��½�ɹ�");
                break;
            } else {
                if (i == 2) {
                    System.out.println("����3�λ���������");
                } else {
                    System.out.println("�û������������,������¼�롣������" + (2 - i) + "�λ���");
                }

            }
        }
    }

}
