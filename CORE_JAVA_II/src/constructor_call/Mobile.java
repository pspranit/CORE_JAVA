package constructor_call;

public class Mobile extends Product {
    double pPrice=50000.00;
    String pName="HP";
    int qty=10;

    void info()
    {
        System.out.println("PRICE :"+pPrice);
        System.out.println("PRODUCT NAME :"+pName);
        System.out.println("QTY :"+qty);

        //DATA MEMBER ACCESS BY USING SUPER KEYWORD
        System.out.println("PRODUCT PRICE :"+super.pPrice);
        System.out.println("PRODUCT QTY :"+super.qty);
        System.out.println("PRODUCT NAME: "+super.pName);

        super.pInfo();  //METHOD CALL BY USING SUPER KEYWORD

    }
}
