package day16;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo12 {
//���M�b�Q�ɼ���
//���M�D�Q�ɼ����mȻ�������ӻ��ߜp��Ԫ�ص����܉�ʹ�ü��ϵ���������
    public static void main(String[] args) {
//        demo1();
//        demo2();
        //�����D���M�����Ϸ��͵�
        demo3();

    }

    private static void demo3() {
        List<String> arrList = new ArrayList<String>();
        arrList.add("a");
        arrList.add("c");
        arrList.add("d");
        arrList.add("e");
        String[] arr = arrList.toArray(new String[0]);
        //�����D�Q�ɔ��M�ĕr�򣬔��M���L�������С춵�춼��ϵ�size�r�����N�D�Q���L�Ⱦ���size���L��
        //������M���L�ȴ��size������Ĕ��M�L�Ⱦͺ����ƶ����L��һ��8
        for (String string : arr) {
            System.out.println(string);
            
        }
    }

    private static void demo2() {
        //����������͵Ĕ��M�D�Q�ɼ��ϕ����������M����һ�������M���D�Q
//        int[] arr = {1,2,3,4,5};
//        List arrList = Arrays.asList(arr);
//        System.out.println(arrList);
      //���M���D�Q�ɼ������N��������õĔ������
        //�����������������D�Q�ɼ������N��Ҫ�������Č����İ��b�
        Integer[] arr ={1,2,3,4,5};
        List arrList = Arrays.asList(arr);
        System.out.println(arrList);
    }

private static void demo1() {
    String[] arr = {"a","b","c","d"};
    List<String> arrList = Arrays.asList(arr);
//        arrList.add("e");//�����e
    System.out.println(arrList);
}

}
