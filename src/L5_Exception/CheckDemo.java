package L5_Exception;

public class CheckDemo {

    private int count;

    public static void main(String[] args) {

        //getDeclaredMethods ka shi ta mya method ko kaw
        var methods = CheckDemo.class.getDeclaredMethods();

        for (var method : methods){
            System.out.println(method.getName());
        }
    }

    static void hello ()throws RuntimeException , NullPointerException{
        System.out.println("Hello Method");
    }

    void thr(){
        //this is uncheckException
        throw new RuntimeException();
    }

    /*
    throw ka Error / UncheckException(Runtime) twy ko throw lod loh ya
    Handle ma lod lal ya
    Error ka environment kyg so tot ma tone think
    **CheckException ko throw lod yin ma pyit ma ny Handle lod pay ya**
    ***CheckException ko throw lod yin method naug mr "throws" ko ma pyit
    ma ny kaw ya***
    2Ways to Handle CheckException
    1. Try Catch
    2. throws

    throws lod htr tk CheckException method ko kaw yin
    kaw tk method mr Handle lod pay ya
    **kaw tk kg ko Handle lod say chin yin throws ko tone

   */
    void sayHello() throws Exception{
        if (count <= 0){
            throw new Exception();
        }
        System.out.println("Hello from object");
    }
                      //2
    void doBusiness() throws Exception{
        hello();
        /*
        Check Exception ko Handel lod tk way 2ways shi
        1. Try Catch
        2. Sub throws
         */

        //1
        try {
            sayHello();
        } catch (Exception e){
            System.out.println("Error");
        }
    }

}
