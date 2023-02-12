package L2_DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class L4_AdjustingValues {
    public static void main(String[] args) {
        var date = LocalDate.now();
        var v = date.with(ChronoField.DAY_OF_MONTH,10);
        var v1 = date.with(ChronoField.YEAR,2077);


        var atDateTime = date.atStartOfDay();

        //==================
        //Temporal Adjustor
        var firstDay = date.with(a -> LocalDate.of(date.getYear(),date.getMonth() , 1));
        var t = TemporalAdjusters.previousOrSame(null);


        var today = LocalDate.now();
        /*
        TemporalAdjusters ta = temporal ->{
            var year = temporal.get(ChronoField.YEAR);
            var month = temporal.get(ChronoField.MONTH_OF_YEAR);
            return LocalDate.of(year, month, 1);
        }
         */

        /*
    isSupported(TemporalUnit)   boolean  Temporal Unit ကို Support လုပ်မလုပ်စစ်ေပးနိုင်ပါတယ်
    with(TemporalAdjuster)      Temporal Current Temporal Object အား သတ်မှတ်ထားေသာ Argument တန်ဖိုးြဖင့် Value ကို Adjust လုပ်ပြီး
    with(TemporalField, long)   Temporal  ေနာက်ထပ် Temporal Object တစ်ခုအား တည်ေဆာက်ေပးနိုင်ပါတယ်

    plus(TemporalAmount)        Temporal Current Temporal Object အား သတ်မှတ်ထားေသာ Argument တန်ဖိုးြဖင့် Value ကိုေပါင်းပြီီး
    plus(long, TemporalUnit)    Temporal    ေနာက်ထပ် Temporal Object တစ်ခုအား တည်ေဆာက်ေပးနိုင်ပါတယ်
    minus(TemporalAmount)       Temporal Current Temporal Object အား သတ်မှတ်ထားေသာ Argument တန်ဖိုးြဖင့် Value ကိုနှုတ်ပြီီး
    minus(long, TemporalUnit)   Temporal    ေနာက်ထပ် Temporal Object တစ်ခုအား တည်ေဆာက်ေပးနိုင်ပါတယ်
    until(Temporal, TemporalUnit) long Current Temporal မှ Target Temporal အထိဘယ်ေလာက်ကွာသလဲဆိုတာကိုသိရှိနိုင
         */

        //with
        LocalDate td = LocalDate.now();
        TemporalAdjuster fd = temporal -> LocalDate.of(
                temporal.get(ChronoField.YEAR),
                temporal.get(ChronoField.MONTH_OF_YEAR),
                1
        );
        var firstDate = td.with(fd);
        td.with(ChronoField.DAY_OF_MONTH,1);
        td.with(ChronoField.MONTH_OF_YEAR,6);

        td.withYear(2023);
        td.withDayOfMonth(20);

        //plus minus
        var dateTime = LocalDateTime.now();
        var d1 = dateTime.with(ChronoField.HOUR_OF_DAY,12);
        var d = dateTime.plusHours(12);
        var dd = dateTime.minusMinutes(31);


    }
}
