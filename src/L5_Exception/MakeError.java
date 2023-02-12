package L5_Exception;

public class MakeError {
    public static void main(String[] args) {
        System.out.println("Start Program");

        //exception handlers
        try {
            method1();
        } catch (ArithmeticException e){
            System.out.println("Error in Main method");
        }


        System.out.println("End Program");
    }

    static  void method1(){
        System.out.println("Method 1");
        method2();
        System.out.println("Method 1 End");
    }
    static void method2(){
        System.out.println("Method 2");
        method3();
        System.out.println("Method 2 End");
    }
    static void method3(){
        System.out.println("Method 3");
        method4();
        System.out.println("Method 3 End");

    }
    static void method4(){
        System.out.println("Method 4");
        int i = 10 /0;
        System.out.println("Method 4 End");

    }
}

/*
        Exception 3Myo shi
        1. Error                environment kyg por tk hrr
        2. Check Exception
        3. Uncheck Exception (Runtime Exception)

                    Throwable
               |                |
          Error             Exception
            |                   |               ---   Uncheck Exception(Runtime)
         other error        other exception                     |
                                                     other runtime exception
 */
