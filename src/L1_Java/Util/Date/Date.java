package L1_Java.Util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) throws ParseException {
        /*
        java.util.Date
        java.util.Calendar

        JDBC
        java.sql.Date

        date & Time API
         */

        var date = new Date();

         var cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        Calendar c = Calendar.getInstance();
        //Date d = c.getTime();
        //System.out.println(d.toString());

        cal.set(2020,3,1);
        System.out.println(cal.getTime());

        //string to date
        String str = "2023-18-01 23:00";
        var df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        var fDate = df.parse(str);
        System.out.println(fDate.toString());

        /*before and after
        var date1 = new Date();
        var date2 = new Date();
        var boo = date1.after(date2);  //false
        var boo1 = date1.before(date2);  //true
        var v = date1.compareTo(date2);  //-1   tu yin 0

         */

        var cal1 = Calendar.getInstance();
        cal1.get(Calendar.YEAR);
        cal1.get(Calendar.DATE);

        //ADD
        var cal2 = Calendar.getInstance();
        cal2.getTime();
        cal2.add(Calendar.DAY_OF_MONTH , 5);
        cal2.add(Calendar.DAY_OF_MONTH , -12);
        //ROLL ka day ko + ll month ma toe
        cal2.roll(Calendar.DAY_OF_MONTH , 29);


    }
}
