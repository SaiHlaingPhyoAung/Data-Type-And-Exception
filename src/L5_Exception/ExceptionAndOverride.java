package L5_Exception;

public class ExceptionAndOverride {
    public static void main(String[] args) {
        test(new SuperClass());

        test(new SubClass());
    }

    static void test(SuperClass obj){
        try {
            obj.doSomething();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

//super class ka dr pl lod loh ya tl so child class ka dr pl lod loh ya
//child class ka super class lod tr ko kyaw p lod loh ma ya

//**super class mr kyite tk exception pyit loh ya
//super class mr exception pyit htr yin sub class mr exception ma pyit lal ya
//sub class mr Error / Runtime exception pyit htr yin super class mr ma pyit lal ya
//**sub class mr CheckException pyit htr yin super mr ma pyit loh ma ya

class SuperClass{
    void doSomething() throws Exception{
        System.out.println("Hello from Super class");
    }
}

class SubClass extends SuperClass{
    void doSomething() throws NullPointerException {
        System.out.println("Hello from Sub class");
    }
}

class MyException extends Exception{

}
class MyException2 extends Exception{

}
