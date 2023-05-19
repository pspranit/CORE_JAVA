package method_overriding;

import java.util.Scanner;

class Ecommerce
{
    void sellProduct(int qty,double price){
        double total=qty*price;
        System.out.println("TOTAL COST: "+total);
    }
}

class Flipcart extends Ecommerce
{
    void sellProduct(int qty,double price)
    {
        double total=qty*price;
        double discount=total-total*0.1;
        System.out.println("TOTAL COST: "+total);
        System.out.println("10% DISCOUNT: "+discount);
    }
}

class Amazon extends Ecommerce {
    @Override
    void sellProduct(int qty, double price) {
    double total=qty*price;
    double discount=total-total*0.05;
    System.out.println("TOTAL COST: "+total);
    System.out.println("10% DISCOUNT: "+discount);
    }
}

public class MainApp2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER QTY");
        int qty=sc.nextInt();
        System.out.println("ENTER PRICE");
        double price=sc.nextDouble();

        System.out.println("SELECT ECOMMERCE PLATFORM");
        System.out.println("1)Flipcart\n2)Amazon");
        int choice=sc.nextInt();

        if(choice==1){
            Flipcart f1=new Flipcart();
            f1.sellProduct(qty,price);
        }
        else if (choice==2) {
            Amazon a1=new Amazon();
            a1.sellProduct(qty,price);
        }
        else {
            System.out.println("INVALID CHOICE");
        }
    }
}
