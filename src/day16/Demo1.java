package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    // ȥ��һ���������ظ���
    // ������
    /*
     * �����¼��� ���ݾɵļ��ϻ�ȡ������ �����ϼ��� ͨ���ж��Ƿ��ظ������µļ�����
     */
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>();
        arrList.add("10");
        arrList.add("10");
        arrList.add("10");
        arrList.add("20");
        arrList.add("20");
        arrList.add("30");
        arrList.add("40");
        arrList.add("40");
        arrList.add("50");

        demo_1(arrList);
    }

    private static void demo_1(List arrList) {

        List singeList = new ArrayList();
        Iterator it = arrList.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (!singeList.contains(o)) {
                singeList.add(o);
            }
        }
        Iterator<String> it1 = singeList.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }

}
