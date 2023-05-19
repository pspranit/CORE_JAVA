package collectionframework;

import java.util.ArrayList;

public class ArrayListDemo10 {
    public static void main(String[] args) {

        Product p1=new Product(100,"TV",25000.00);
        Product p2=new Product(101,"MOBILE",40000.00);
        Product p3=new Product(102,"AC",55000.00);
        //List of Custom Object
        ArrayList<Product>data=new ArrayList<>();
        data.add(p1);
        data.add(p2);
        data.add(p3);

        for(Product p:data)
        {
            System.out.println(p);
        }
    }
}
