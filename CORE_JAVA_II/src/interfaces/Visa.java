package interfaces;

//implementation
public class Visa implements CreditCard {

    @Override
    public void getType() {
        System.out.println("CARD TYPE IS VISA");
    }

    @Override
    public void WithDraw(double amt) {
        System.out.println("TRANSACTION SUCCESSFUL Rs :"+amt);
    }
}
