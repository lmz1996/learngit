package com.sbibits.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {
/*A:��ֵ�Զ����Ҽ���ֵ˼·��
* ��ȡ���м�ֵ�Զ���ļ���
* ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
* ���ݼ�ֵ�Զ����Ҽ���ֵ
*/
    public static void main(String[] args) {
        //�ڶ��ֵ�����ʽ(��ֵ�Զ����Ҽ���ֵ˼·)
        //��˫�м��ϵļ�ֵ�Ա�ɵ��еļ�ֵ�Զ���,Ȼ�������������ȡÿһ����ֵ�Զ���,���ݼ�ֵ�Ի�ȡ����ֵ
//        Map.Entry<K, V>Demo_4����
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("����", 20);
        map.put("����", 22);
        map.put("����", 29);
        map.put("����", 27);
        //Map.Entry˵��Entry��Map���ڲ��ӿ�,���Ҵ洢��Set������
        //��ȡ���м�ֵ�Զ���ļ���map.entrySet();
        //���԰�Map.Entry<String,Integer>���Կ�����һ��Person�������ǿ���ͨ��get������ȡ����
        Set<Map.Entry<String,Integer>> entrySet =map.entrySet();
        //1:�õ�������ȡÿһ������
//        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
//        while(it.hasNext()){
//            //��ȡÿһ��Entry����
//             Map.Entry<String, Integer> en = it.next();
//             String key = en.getKey();
//             Integer value = en.getValue();
//             System.out.println(key+"..."+value);
//        }
            //2:foreach
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+"..."+entry.getValue());
        }
    }

}
