package day17;

import java.util.HashSet;

public class Demo1_HashSet {
    /*
     * set����������,�������ظ�,����(��ȡ��һ��)
     */
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        boolean b1 = hashSet.add("a");
        boolean b2 = hashSet.add("a");
        // System.out.println(b1);
        // System.out.println(b2);//����set����������ظ�Ԫ��ʱ����false
        hashSet.add("b");
        hashSet.add("d");
        hashSet.add("c");
        for (String string : hashSet) {//ֻҪ���õ������Ķ���ʹ��foreach
            System.out.println(string);
        }
        System.out.println(hashSet);// hashSet�ļ̳���ϵ������дtoString����

    }

}
