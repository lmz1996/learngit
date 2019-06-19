package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
    /*
     * ȥ��ArrayList�е��Զ������Ԫ�� A:������ʾ ����ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ������ĳ�Ա����ֵ��ͬ��
     * B:ע����дequals��������Ϊcontains�����ײ��õ���equals������new����ĵ�ֵַ����ͬ��equals�Ƚϵ���ָ��
     * ����������Ҫ��Person����дequals����,����ͻ���object��equals�����Ƚϵ��ǵ�ֵַ
     */
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();
        arrList.add(new Person("����", 20));
        arrList.add(new Person("����", 20));
        arrList.add(new Person("����", 21));
        arrList.add(new Person("����", 22));
        ArrayList newList = demo_1(arrList);
        System.out.println(newList);

    }

    private static ArrayList demo_1(ArrayList arrList) {

        ArrayList singeList = new ArrayList();
        Iterator it = arrList.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (!singeList.contains(o)) {
                singeList.add(o);
            }
        }
        return singeList;
    }

}
