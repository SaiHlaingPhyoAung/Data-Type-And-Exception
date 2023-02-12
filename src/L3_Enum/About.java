package L3_Enum;

import java.util.Arrays;

public class About {
    /*what is enum
    Enum ko kane tay a nay nk tone
    Object is not static
    Object ko static lo yay tr ko enum loh kaw
     */

    public static void main(String[] args) {
        show(Day.MON);
        //show(10);   di lo yay loh ma ya
        Day monday = Day.MON;
        //monday++
        System.out.println(monday);

        //enum hte shi ta mya data twy ko array nk pya
        Day d [] = Day.values();
        System.out.println(Arrays.toString(d));

        for (Day a : Day.values()){
            System.out.println(a);
        };

        //value of ka same data pl pyan pay
        var v = Day.valueOf("SAT");  //ma shi tr yay yin exception pyit
        System.out.println(v);

        //String pay
        Day.SUN.name();

        //ordinal ka array index num pay
        Day.SAT.ordinal();
    }

    static void show(Day day){
        System.out.println(day);
    }
}

enum Day{
    SUN , MON , TUE , WED , THU , FRI , SAT // ";" hte ll ya ma hte ll ya / out mr code yay chin yin ";" hte
        }