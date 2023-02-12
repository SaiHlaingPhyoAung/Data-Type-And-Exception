public class L1_String {
    public static void main(String[] args) {

        // string to integer
        int data1 = Integer.valueOf("1234");
        // string to double
        double data2 = Double.valueOf("234.567");

        // float to String
        Float data3 = 1234.56f;
        String str1 = data3.toString();
        // shot to String
        Short data4 = 890;
        String str2 = String.valueOf(data4);

        //Multi Line String
        //Text Block
        String str = """
                This is Multi Line String
                From Sting Lessons""";

        //Literal String and Object String are Different

        String s = "Literal";
        String ss = "LITERAL";
        String sss = "soifjwoefw";
        String s1 = new String("Object");
        int i = s.compareTo(ss);
        System.out.println(i);
        /*
        Literal String ka Stack Memory ka ny Heap Memory por ka String pool hte ka kg ko u
        Object String ka Stack Memory ka ny Heap Memory por Object sout p mha String pool hte ka kg ko kaw

        Literal String
        Stack memory > Heap memory > String pool

        Object String
        Stack memory > Heap memory > Object > String pool

        That is why Literal String And Object String are different
         */

        /*
        String Buffer / Builder
        Multi thread - Buffer (thread save pyit chin yin)
        Single thread - Builder
         */

        //StringBuilder mr capacity 16 shi
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(10);
        System.out.printf("Capacity : %d%n", sb.capacity());
        System.out.printf("Length : %d%n", sb.length());

        sb.append("Greetings");
        System.out.printf("Capacity : %d%n", sb.capacity());
        System.out.printf("Length : %d%n", sb.length());

    }
}