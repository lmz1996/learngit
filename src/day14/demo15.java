package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo15 {

    public static void main(String[] args) throws ParseException {
        //��һ�³���������һ��������
        String birthday = "1996��08��13��";
        String today = "2088��06��11��";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy��MM��dd��");
        Date bir = sdf.parse(birthday);
        Date to = sdf.parse(today);
        long time1 = bir.getTime();
        long time2 = to.getTime();
        long time = time2 - time1;
        System.out.println(time/1000/60/60/24/365);
        

    }

}
