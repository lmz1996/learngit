package com.sbibits.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4_Exception {

    public static void main(String[] args) throws FileNotFoundException {
        // 1:�ᷢ���������쳣(δ������쳣),��Ϊ����ȷ���᲻�ᷢ������,�п��ܳ������⡣�����Ҳ����ļ�
        // ��ʱ����try catch���׳��쳣,�������ֵ�һ���׳�
        FileInputStream file = new FileInputStream("ttt.txt");

    }

}
