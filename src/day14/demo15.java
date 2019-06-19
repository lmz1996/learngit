package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo15 {

    public static void main(String[] args) throws ParseException {
        //算一下出生到现在一共多少天
        String birthday = "1996年08月13日";
        String today = "2088年06月11日";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日");
        Date bir = sdf.parse(birthday);
        Date to = sdf.parse(today);
        long time1 = bir.getTime();
        long time2 = to.getTime();
        long time = time2 - time1;
        System.out.println(time/1000/60/60/24/365);
        

    }

}
