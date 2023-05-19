package collectionframework;

import java.util.Scanner;

public class ArrayListDemo11
{
    public static void main(String[] args)
    {
       Scanner sc1=new Scanner(System.in);
        BookOperations b=new BookOperations();
        boolean status1=true;

        while(true) {
            System.out.println("SELECT MODE OF OPERATIONS");
            System.out.println("1.ADD NEW BOOK");
            System.out.println("2.DISPLAY ALL BOOK");
            System.out.println("3.DELETE EXISTING BOOK");
            System.out.println("EXIT");

            System.out.println("ENTER CHOICE");
            int choice = sc1.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("ENETR BOOK ID");
                    int id = sc1.nextInt();
                    System.out.println("ENTER BOOK NAME");
                    String name = sc1.next();
                    System.out.println("ENTER BOOK PRICE");
                    double price = sc1.nextDouble();
                    b.addBook(id, name, price);
                    break;

                case 2:
                    b.displayBook();
                    break;

                case 3:
                    System.out.println("ENTER BOOK ID");
                    int newId = sc1.nextInt();
                    b.deleteBook(newId);
                    break;

                case 4:

                default:System.exit(0);
            }
        }
    }
}
