package L2_DateAndTimeAPI;

import java.time.Duration;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class L6_TemporalUnits {
    public static void main(String[] args) {

        /*
        Factory Method of Period
        between(LocalDate, LocalDate) LocalDate နှစ်ခုအကြားမှာရှိတဲ Period ကိုရယူနိုင်ပါတယ်
        of(int, int, int)             Years, Months, Days Amount ေတွကိုအသံုးပြုပြီး Period ကိုတည်ေဆာက်နိုင်ပါတယ်
        of[Prefix](long)              Days, Weeks, Months, Years ပမာဏကိုသတ်မှတ်ပြီး Period ကိုတည်ေဆာက်နိုင်ပါတယ်
        parse(CharSequence)           ISO Period Format String ကေန Parse လုပ်ေပးနိုင်ပါတယ်
                                      “PnYnMnD”, “PnW”
        from(TemporalAmount)          အြခားေသာ Date Base TemporalAmount Object ရဲ့ Value ေတွကိုေပါင်းပြီး Period
                                       Object တစ်ခုကိုတည်ေဆာက်နိုင်ပါတယ
         */

        //of(int ,int ,int)
        Duration.of(1, ChronoUnit.DAYS);
        Duration.of(10,ChronoUnit.MINUTES);
        Period.of(1,6,0);
        Period.ofDays(10);
        //off[Prefix](long)
        Period.ofYears(1).plusMonths(6);

        //from
        TemporalAmount amount = Duration.ofHours(24);
        amount = Period.ofDays(1);
        Period p = Period.from(amount);

        //parse
        var str = "P20D";
        Duration.parse(str);//output PT480H
        var pe = "P4W";
        Period.parse(pe);

        //get
        var d = Duration.parse("P23DT6H30M22.23S");
        var pp = Period.parse("P1Y3M30D");
        d.getUnits();//support lod tk kg ko kyi
        d.getNano();
        pp.getYears();
        pp.getDays();
        pp.getMonths();

        d.get(ChronoUnit.SECONDS);
        d.toMinutes();
        d.toMinutesPart();
        pp.toTotalMonths();

        pp.withDays(12);
        pp.plus(Period.parse("P4W"));
        pp.plusMonths(3);
        pp.minusDays(5);
        var dd = Duration.parse("P10D12H");
        dd.withNanos(123);//with is equal plus
        

    }
}
