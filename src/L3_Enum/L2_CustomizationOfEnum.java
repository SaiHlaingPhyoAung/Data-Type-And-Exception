package L3_Enum;

import java.util.Arrays;

public class L2_CustomizationOfEnum {
    public static void main(String[] args) {
        for (Days d :Days.values()){
            showDay(d);
            d.log();
        }
    }

    static void showDay(Days day){
        System.out.println(day);
        System.out.println(day.getViewName());
    }
}

interface Loggable{
    void log();
}

enum Days implements Loggable{
    SUN("Sunday") ,
    MON("Monday") ,
    TUE("Tuesday") ,
    WED("Wednesday"),
    THU("Thursday"),
    FRI("Friday") {
        public void log() {
            System.out.println("Today is Happy Friday");
        }
    },
    SAT("Saturday");

    private String viewName;
    private int i ;

    public void log(){
        System.out.println("Today is " + viewName);
    };

    Days(String viewName ){
        this.viewName = viewName;
    }

    public String getViewName(){
        return this.viewName;
    }

    public String toString(){
        return getViewName();
    }
}

