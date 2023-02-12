package L2_DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Scanner;

public class L3_Temporal_Accessor {
    public static void main(String[] args) {
        var date = LocalDate.now();
        var time = LocalDate.now();

        var chrono = date.get(ChronoField.YEAR);
        var chrono1 = date.get(ChronoField.MONTH_OF_YEAR);
        var chrono2 = date.get(ChronoField.DAY_OF_MONTH);

       // var chr = time.get(ChronoField.NANO_OF_SECOND);
        var year = Year.of(2020);
        var leap = year.isLeap();

        var month = YearMonth.now();
        var leap1 = month.isLeapYear();
        var lastDay = month.lengthOfMonth();
        var lastYear = month.lengthOfYear();

        System.out.println("Enter Your Year");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        var inYear = Year.of(input);
        var tf = inYear.isLeap();
        if (tf == true){
            System.out.println("It's A Leap Year");
        }
        else {
            System.out.println("It's Not A Leap Year");
        }

        /*
    isSupported(TemporalField)  boolean Temporal Field ကို Support လုပ်မလုပ်စစ်ေပးနိုင်ပါတယ်
    range(TemporalField)        ValueRage သတ်မှတ်ထားေသာ Temporal Field အထိ Range Value ကိုရယူနိုင်ပါတယ်
    get(TemproalField)          int Temporal Field တန်ဖိုးကိုရယူနိုင်ပါတယ်
    getLong(TemporalField)      long Temporal Field တန်ဖိုးကို long type ြဖင့်ရယူနိုင်ပါတယ်
    query(TemporalQuery<R>)     R Date Time Information ကို Query ေရးပြီးရယူနိုင်ပါတယ
         */

        //get
        var now = LocalDateTime.now();
        now.get(ChronoField.YEAR);
        now.get(ChronoField.MONTH_OF_YEAR);

        //supported fluent method
        now.getYear();
        now.getMonth();
        now.getHour();


    }
}
