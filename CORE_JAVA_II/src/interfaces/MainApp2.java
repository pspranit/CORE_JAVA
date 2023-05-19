package interfaces;


public class MainApp2 {
    public static void main(String[] args) {

        CreditCard credit;

        credit=new Visa();      //upcasting
        credit.getType();
        credit.WithDraw(2500);

        System.out.println("=======================================");

        credit=new MasterCard();   //upcasting
        credit.getType();
        credit.WithDraw(35);
    }
}
