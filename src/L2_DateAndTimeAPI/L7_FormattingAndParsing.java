package L2_DateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.format.DateTimeFormatter.ofLocalizedDateTime;
import static java.time.format.DateTimeFormatter.ofPattern;
import static java.time.temporal.WeekFields.ISO;

public class L7_FormattingAndParsing {
    public static void main(String[] args) {
        var fmt = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        var now = LocalDate.now();
        var dateString = fmt.format(now);//to string
        now.format(fmt);
        var parseResult = fmt.parse(dateString);

        /*
        Date Time Formatter
        1. ISO Format    //global ko service pay yin iso ko tone
        ISO ka String output pay
        2. Localize Format
        3. Custom Format
         */

        var iso = DateTimeFormatter.ISO_DATE;

        //Localize   FULL/LONG/MEDIUM/SHOT
        var loc = ofLocalizedDateTime(FormatStyle.FULL);
        loc.format(ZonedDateTime.now());
        Locale.getDefault();

        Locale.setDefault(Locale.JAPAN);
        var lol = Locale.getDefault();
        ofLocalizedDateTime(FormatStyle.FULL).format(ZonedDateTime.now());
        var mm = loc.format(ZonedDateTime.now());//myanmar

        //Custom
        ofPattern("y-M-d").format(LocalDate.now());//(yy-MM-dd) (yy-MMM-dd) (yy-MMMM-dd)
        ofPattern("yy-MMM-dd",Locale.UK).format(LocalDate.now());

        ofPattern("y-MMMM-dd hh:mm a",Locale.US).format(LocalDateTime.now());
    }
}
