package L2_DateAndTimeAPI;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class L5_TemporalAmount {
    public static void main(String[] args) {
        /*
        get(TemporalUnit)  long သတ်မှတ်ထားေသာ TemporalUnit ရဲ့ Value ကိုရယူနိုင်ပါတယ်
        getUnits()         List<TemporalUnit> အသံုးပြုနိုင်ေသာ Temporal Unit List ကိုရရှိိနိုင်ပါတယ်
        addTo(Temporal)    Temporal     Temporal Object အား လက်ရှိ Temporal Amount ကိုေပါင်းပြီး
                                        ေနာက်ထပ် Temporal Object တစ်ခုကိုတည်ေဆာက်နိုင်ပါတယ်
        substractFrom(Temporal) Temporal    Temporal Object အား လက်ရှိ Temporal Amount ကိုနှုတ်ပြီး
                                        ေနာက်ထပ် Temporal Object တစ်ခုကိုတည်ေဆာက်နိုင်ပါတယ
         */

        //Duration for Minute and Second
        //Period   for Year , Month , Day

        var fiveHours = Duration.ofHours(5);
        var fiveAndHalf = fiveHours.plusMinutes(30);
        var thirtyMin = Duration.parse("PT30M");

        //duration twy ko time pr tk ny yr mr pg loh ya
        var now = LocalDateTime.now();
        var time = LocalTime.now();
        var today = LocalDate.now();
        time.plus(fiveAndHalf);
        now.plus(thirtyMin);
        now.minus(fiveHours);

        var fiveDays = Period.ofDays(5);
        var oneMonthAndFiveDays = fiveDays.plusMonths(1);
        today.plus(oneMonthAndFiveDays);
        today.plus(fiveDays);
        today.plus(5, ChronoUnit.DAYS);
        today.plus(5, ChronoUnit.MONTHS);
        //today.plusMonths(1).withDayOfMonth(300);//error
        today.plusDays(300);

    }
}

class amountBetweenTemporal{
    public static void main(String[] args) {

        /*Usage of Temporal Amount
        1. Static Factory Methods
        2. Getting Supporting Unit Value
        3. Unit Conversion
        4. Adjusting Unit Value
         */

        /*
        between(Temporal, Temporal)   Temporal Object နှစ်ခုအကြားမှာရှိတဲ Duration ကိုရယူနိုင်ပါတယ်
        of(long, TemporalUnit)        Days, Hours, Minutes, Seconds, NanoSeconds Unit Value ေတွကေနတဆင့်
        of[Prefix](long)                              Durationကိုတည်ေဆာက်နိုင်ပါတယ်

        parse(CharSequence)           ISO Duration Format String ကေန Parse လုပ်ေပးနိုင်ပါတယ်
                                      “PnDTnHnMn.nS”
        from(TemporalAmount)          အြခားေသာ Time Base TemporalAmount Object ရဲ့ Value ေတွကိုေပါင်းပြီး Duration
                                      Object တစ်ခုကိုတည်ေဆာက်နိုင်ပါတယ
         */

        //between
        var startTime = LocalTime.of(9,0);
        var startDateTime = LocalDateTime.of(LocalDate.of(2023,1,1),startTime);
        var startDate = startDateTime.toLocalDate();
        var durationForToday = Duration.between(startTime,LocalTime.now());
        var durationForDateTime = Duration.between(startDateTime,LocalDateTime.now());
        //var error  = Duration.between(startDateTime,LocalDate.now());
        //shae ka tay p naug ka kyi yin ya
        //eg startTime,LocalDateTime.now();

        Period.between(startDate,LocalDate.now());
        Period.between(LocalDate.now(),startDate);//minus nk pya -3days
    }
}
