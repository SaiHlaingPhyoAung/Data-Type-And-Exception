package L5_Exception;

public class Finally {
    /*
    Try / Catch
    Try / Catch / Finally
    Try Multi Catch (java 7)
    Try with Resource (java 7)
     */

    public static void main(String[] args) {
        test(new sup());
        test(new sub());
        
    }

    static void test(sup obj){
        try {
            obj.doSomething();
            return; //*** return lod htr ll finally ka a lod lod
            //a nae sone finally ka 1khr a lod lod

            //Try Multi Catch
        } catch (myEx2 | myEx e) {
            System.out.println("My Exception is catch here!");
        } catch (Exception e ){
            e.printStackTrace();

            //finally ka exception pyit" ma pyit" a lod lod
        } finally {
            System.out.println("Finally here");
        }

    }
}

class sup{
    void doSomething() throws Exception{
        System.out.println("Hello From Super Class");

        throw new myEx();
    }
}

class sub extends sup{
    void doSomething() throws myEx2{
        System.out.println("Hello From sub Class");
    }
}

class myEx extends Exception{

}
class myEx2 extends Exception{

}