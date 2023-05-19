package interfaces;

//implementaton
public class MasterCard implements CreditCard
{

    @Override
    public void getType() {
        System.out.println("CARD TYPE IS MASTERCARD");
    }

    @Override
    public void WithDraw(double amt) {
        System.out.println("TRANSACTION SUCCESSFUL dlr :"+amt);
    }
}
