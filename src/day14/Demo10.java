package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo10 {
    /*
     * Date
     */
    public static void main(String[] args) {
        // demo_1();
        // demo_2();
       
        demo_3();
    }

    private static void demo_3() {
        // ��ʱ���ַ���ת����ʱ�����
        String a = "2019/06/11 23:20:38";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Date d = sdf.parse(a);
            System.out.println(d);
        } catch (ParseException e) {

            e.printStackTrace();
        }
    }

    private static void demo_2() {
        Date date = new Date();// ������ǰʱ�����
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");// ������ʽ������
        System.out.println(sdf.format(date));
    }

    private static void demo_1() {
        Date date = new Date();// ������ǰʱ�����
        SimpleDateFormat sdf = new SimpleDateFormat();// ������ʽ������
        System.out.println(sdf.format(date));// ���ص���һ��string���ַ���19-6-11 ����11:17
    }

}
