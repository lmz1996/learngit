package com.sbibits.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo1 {
/*
 *  ����¼��һ��int���͵�����,����������Ʊ�����ʽ
     * ���¼�����������,������ʾ,¼�����������������¼��һ������BigInteger
     * ���¼�����С��,������ʾ,¼�����С��,������¼��һ������
     * ���¼����������ַ�,������ʾ,¼����ǷǷ��ַ�,������¼��һ������
 
 */
    /*
     * ����:
     * 1:��������¼�����
     * 2:������¼��Ľ���洢��string���͵��ַ�����,��Ϊ�洢int����������в�����������ֱ�ӱ���,�޷������ж�
     * 3:����¼��Ľ��ת����int����,����ȷ�Ļ��Ǵ����
     * 4:��ȷ��ֱ��ת��
     * 5:�����Ҫ���ж�Ӧ���ж�
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������:");
        while (true) {
            String line = sc.nextLine();
            try {

                int num = Integer.parseInt(line);
                System.out.println(Integer.toBinaryString(num));
                break;
            } catch (Exception e) {
                try {
                    new BigInteger(line);// ֻҪ�ܹ�����BigInteger�о��ܹ�˵�����ǹ����������,���ǻ��п�����С�������Ի���Ҫtry
                                         // catch
                    System.out.println("����һ���������������������һ������:");
                } catch (Exception e1) {
                    try {
                        new BigDecimal(line);// ����ܹ��Ž�ȥ˵����С��,����������ĸ���Ի���Ҫtry
                                             // catch
                        System.out.println("����һ��С������������һ������:");
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        System.out.println("����������һ���Ƿ��ַ�������¼��");
                    }
                }
            }
        }

    }

}
