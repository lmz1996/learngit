package day16;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo10 {
    /*
     * ���Ͽ��(���ֵ������ܷ�ɾ��)(����) ��ͨforѭ��,����ɾ��,��������Ҫi--
     * ������,����ɾ��,���Ǳ���ʹ�õ����������remove����,�������ֲ����޸��쳣 
     * ��ǿforѭ������ɾ��,��Ϊforeach�ײ��õ��ǵ�����,������list��remove�����ᷢ�������޸�ɾ��
     * ���Բ���
     */
    public static void main(String[] args) {
        // ��ͨforѭ��ɾ��
        // demo1();
        // ������ɾ��
       demo2();
    }

    private static void demo2() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("a");
        arrList.add("b");
        arrList.add("b");
        arrList.add("c");
        arrList.add("d");
        arrList.add("e");
        Iterator<String> it = arrList.iterator();
        while (it.hasNext()) {
            if ("b".equals(it.next())) {
// ע��һ��Ҫ�õ�������remove����ɾ��������ڵ����Ĺ������ü��ϵ�remove���������޸�,�ᷢ�������޸��쳣
                it.remove();
            }
        }
        System.out.println(arrList);
    }

    private static void demo1() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("a");
        arrList.add("b");
        arrList.add("b");
        arrList.add("c");
        arrList.add("d");
        arrList.add("e");
        for (int i = 0; i < arrList.size(); i++) {
            if ("b".equals(arrList.get(i))) {
                // ��ͨforѭ��,����ɾ��,��������Ҫi--
                // ��Ϊ����������ͬ�������--��ôֻ�ܹ�ɾ��һ��
                // ��Ϊ��i���ڵ�ʱ���һ��bɾ������ô��һ��b�ͻᶨ��ȥȻ��i++����ôb�ͻᱻ����ȥֱ�ӵ�c��
                arrList.remove(i--);// ��i��ָ���Ȼ���һ��,Ȼ���ڼ�һ
            }

        }
        System.out.println(arrList);
    }

}
