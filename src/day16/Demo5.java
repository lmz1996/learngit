package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo5 {
    /* A:���͸���
    * B:���ͺô�
        * ��߰�ȫ��(�������ڵĴ���ת����������) 
        * ʡȥǿת���鷳
    * C:���ͻ���ʹ��
        * <>�зŵı����������������� 
    * D:����ʹ��ע������
        * ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���)
        */
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("����",20));
        list.add(new Person("����",21));
        Iterator<Person> it = list.iterator();
        while(it.hasNext()){
            Person p =it.next();//��Ϊ���˷������в���ǿת
            //Person p = (Person)it.next();
            System.out.println(p.getName()+"..."+p.getAge());
        }

    }

}
