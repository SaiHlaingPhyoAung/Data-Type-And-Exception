package L5_Exception;

public class ErrorDemo {
    public static void main(String[] args) {
        try{
            makeError(2);
        } catch (Exception e){
            System.out.println("Exception in main method");
        } catch (StackOverflowError e){
            //stackOver flow error ka stack memory por mr nay yar ma lout loh
            System.out.println("Stack overflow error");
        }catch (Error e){
            //error > stackOverflow so compile lod loh ma ya
            //baung kyin ka ny a kyal so ya stackOver > error
            System.out.println("Error in main method");
        }
        System.out.println("everything is ok");


    }

    static void makeError(int count){
        System.out.println("Count is " + ++count);

        makeError(count);
    }
}
