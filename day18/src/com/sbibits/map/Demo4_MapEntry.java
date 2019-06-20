package com.sbibits.map;

import com.sbibits.map.Demo4_MapEntry.Inner;

public class Demo4_MapEntry {
    interface Inner {
        interface Inner1 {
            public void show();
        }
    }
}

// 接口里面有另一个接口,Map.Entry说明Entry是Map的内部接口,并且存储在Set中
class Demo implements Inner.Inner1 {

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

}
