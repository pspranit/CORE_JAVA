package interfaces;

public class Phonepe implements UPI,Wallet {
    @Override
    public void transferAmmount(double amt) {
        System.out.println("TRANSFER AMMOUNT :"+amt);
    }

   public void makeBillPayment(double amt)
    {
        System.out.println("MAKE BILL PAYMENT OF Rs :"+amt);
    }
}
