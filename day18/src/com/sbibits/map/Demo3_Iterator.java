package com.sbibits.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {
/*A:键值对对象找键和值思路：
* 获取所有键值对对象的集合
* 遍历键值对对象的集合，获取到每一个键值对对象
* 根据键值对对象找键和值
*/
    public static void main(String[] args) {
        //第二种迭代方式(键值对对象找键和值思路)
        //把双列集合的键值对变成单列的键值对对象,然后遍历这个对象获取每一个键值对对象,根据键值对获取键和值
//        Map.Entry<K, V>Demo_4解释
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("张三", 20);
        map.put("李四", 22);
        map.put("张六", 29);
        map.put("赵六", 27);
        //Map.Entry说明Entry是Map的内部接口,并且存储在Set集合中
        //获取所有键值对对象的集合map.entrySet();
        //可以把Map.Entry<String,Integer>可以看成是一个Person对象我们可以通过get方法获取名字
        Set<Map.Entry<String,Integer>> entrySet =map.entrySet();
        //1:用迭代器获取每一个对象
//        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
//        while(it.hasNext()){
//            //获取每一个Entry对象
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
