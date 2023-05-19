package HAS_A_composition;

public class Shop {
    Salesman s=new Salesman();

    void purchaseProduct()
    {
        s.provideService();
    }
}
