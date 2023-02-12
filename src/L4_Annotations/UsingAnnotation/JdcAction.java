package L4_Annotations.UsingAnnotation;

public class JdcAction implements Action{


    @Override
    @DefaultMessage(
            value = "this is Default message for JDC Action"
            /*
            invoke method ko kaw tk a chin String parameter mr message ma par kat yin
            bl lo message pay ma lal so tr annotation tone p default message
            ko kyo that mark
             */
    )
    public void invoke(String message) {
        System.out.println("JDC Action : " + message);
    }
}
