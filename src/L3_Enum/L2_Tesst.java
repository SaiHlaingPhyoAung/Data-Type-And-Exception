package L3_Enum;

public class L2_Tesst {
    public static void main(String[] args) {
        for (Data d : Data.values()){
            System.out.println("Brand - " + d + "\nPrice - "+ d.getPrice() );
            d.made();
            System.out.println(" ");


        }
    }

   static void show(Data data){
        System.out.println(data);
        System.out.println(data.getPrice());
    }
}
