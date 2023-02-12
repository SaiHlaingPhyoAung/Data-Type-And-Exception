package L3_Enum;

interface List{
    void made();
}

enum Data implements List{
    Toyota (10000){
       public void made(){
            System.out.println("Made in Japan");
        }
    }, Ford (13000), Ferrari (15000), Lambo (15000), BMW(14000);

    private int price;
    public void made(){
         System.out.println("Made In Europe");
    }

    Data(int price){
        this.price = price;
    }

    int getPrice(){
        return price;
    }

}
