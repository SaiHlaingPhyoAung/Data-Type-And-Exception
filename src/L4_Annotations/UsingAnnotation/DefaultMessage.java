package L4_Annotations.UsingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({
        ElementType.METHOD   //method mr tone
})
@Retention(RetentionPolicy.RUNTIME)  //runtime mr tone
public @interface DefaultMessage {
    String value();

    /*br loh annotation mr method tone ll so yin annotation ko tone tk lu si ka
    data pyn lo chin loh tone
     */

}
