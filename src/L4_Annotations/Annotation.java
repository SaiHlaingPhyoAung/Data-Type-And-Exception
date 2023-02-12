package L4_Annotations;

import java.lang.annotation.Documented;

@Documented //meta annotation
//Documented ka Annotation ko Doc htoke pay
//cmd nk javadoc fileName.java nk htoke

public @interface Annotation {
    /*
    Annotation is an Interface
    Annotation nk metadata yay loh ya metadata ko compile time nk runtime mr tone
     */

    String owner();
    String group();
    String def () default "this is default";
    //default yay htr yin kaw tone yin value ma pay lal ya

    String [] arr ();

}

/*
    Meta Annotation 4Myo Shi
    1. Documented
    2. Inherited
    3. Retention
    (1. Class
     2. Runtime
     3. Source)
    4. Target


    @Deprecated        ma tone say chin tk method mr yay
    @Override
    @SupressWarnings   ma tone tk variable toh method toh mr ma tone loh waring por yin ma por ag lod pay
    @FunctionalInterface Annotation
    @SaveVerarges Annotation
 */
