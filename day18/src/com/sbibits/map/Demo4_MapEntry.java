package com.sbibits.map;

import com.sbibits.map.Demo4_MapEntry.Inner;

public class Demo4_MapEntry {
    interface Inner {
        interface Inner1 {
            public void show();
        }
    }
}

// �ӿ���������һ���ӿ�,Map.Entry˵��Entry��Map���ڲ��ӿ�,���Ҵ洢��Set��
class Demo implements Inner.Inner1 {

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

}
