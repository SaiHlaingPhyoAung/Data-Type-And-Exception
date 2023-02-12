package L2_DateAndTimeAPI;

import L1_Java.Util.Date.Date;

import javax.xml.crypto.Data;
import java.time.*;

public class L1_Creation {
    public static void main(String[] args) {
       //now method
        var date =  new Date();
        var dateTime = LocalDateTime.now();     //**
        var dateTime1 = LocalDate.now();        //**
        var dateTime2 = LocalTime.now();        //**
        var instant = Instant.now();
        var zoneDateTime = ZonedDateTime.now();
        var off = OffsetDateTime.now();
        var ym = YearMonth.now();
        var md = MonthDay.now();
        var y = Year.now();

        //of method
        LocalDate.of(2023,1,19);
        //calendar mr ak lo pay loh ma ya / pay yin month ka 1ku po u Calendar output 2023.2.19

        /*
        now() Method        Current Time ကိုရယူနိုင်ပါတယ်
        of prefix Methods   တဖန်နှစ်သက်ရာ တန်ဖိုးကိုသတ်မှတ်ပြီး Date Time Object ေတွကိုတည်ေဆာက်နိုင်ပါတယ်
        from() Methods      TemporalAccessor Object ေတွကေန Date Time Object ေတွကိုတည်ေဆာက်နိုင်ပါတယ်
        parse() Methods     CharacterSequence Object ေတွကေန Date Time Object ေတွကိုတည်ေဆာက်နိုင်ပါတယ
         */

        //now
        Instant.now();
        LocalDateTime.now();
        LocalDate.now();
        LocalTime.now();

        //of
        LocalDate.of(2003,Month.MARCH,1);
        LocalTime.of(10,54);
        LocalDateTime.of(LocalDate.of(2023,1,20),LocalTime.of(10,54));

        /*
        1. Create Date Time
        2. Access Fields
        3. Adjusting Values
        4. Using Temporal Amounts
        5. Formatting & Parsing
         */
    }
}
