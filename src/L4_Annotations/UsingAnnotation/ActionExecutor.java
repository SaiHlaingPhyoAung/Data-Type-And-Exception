package L4_Annotations.UsingAnnotation;

import java.lang.reflect.Method;

public class ActionExecutor {
    public static void execute(Action action , String message) throws Exception{

        //if message is null
        if (null == message){

            Method invoke = action.getClass().getMethod("invoke", String.class);

            if (null != invoke){
                DefaultMessage defaultMessage = invoke.getAnnotation(DefaultMessage.class);

                if (null != defaultMessage){
                    action.invoke(defaultMessage.value());
                }
            }

        } else {
            action.invoke(message);
        }

    }

    public static void main(String[] args) throws Exception{
        Action myAction = new JdcAction();
        execute(myAction, "this is custom message");
        execute(myAction, null);
    }
}
