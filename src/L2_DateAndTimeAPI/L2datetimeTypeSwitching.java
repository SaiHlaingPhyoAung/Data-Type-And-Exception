package L2_DateAndTimeAPI;

import java.time.*;

public class L2datetimeTypeSwitching {
    public static void main(String[] args) {

        /*
                 Date Time API
                    ISO-8601      LocalDateTime
        Instant <-> Gregorian <-> ZonedDateTime
                    calendar      OffsetDateTime
         */

        var local = LocalDateTime.now();

        //machineTime
        var instant = Instant.now();
        var zone = ZonedDateTime.now();
        ZoneId.systemDefault();

        var offset = OffsetDateTime.now();

        /*
                      + ZoneID     -> ZoneDateTime
         LocalDateTime                     ^v
                      + ZoneOffset -> OffsetDateTime
         */

        /*human time to machine time
            Human Time                                  Machine Time
         LocalDateTime           ->
                            toInstant()Method               Instant
         ZonedDateTime       with ZoneOffset            Machine need to Locate
         OffsetDateTime     toInstant()Method           Target on Timeline
                              with no Argument
         */

        //zone to instant
        var zoneInstant = zone.toInstant();
        var tokyo = ZoneId.of("Asia/Tokyo");
        ZoneId.getAvailableZoneIds().stream().filter(a -> a.startsWith("Asia")).forEach(System.out::println);
        var tokyoInstant = local.atZone(tokyo).toInstant();

        //local datetime to tokyo datetime
        var local1 = LocalDateTime.now();
        var zone1 = local1.atZone(ZoneId.systemDefault());
        var instant1 = zone1.toInstant();
        var tokyo1 = instant1.atZone(ZoneId.of("Asia/Tokyo"));
        var yangon = ZoneOffset.ofHoursMinutes(6,30);
        var yangonInstant = local1.toInstant(yangon);

    //machine time to human time

    }
}
