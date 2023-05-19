package encapsulation;

//OUTER CLASS
public class Mobile {

    String companyName="APPLE";

    //INNER CLASS
    class RAM
    {
        void displayInfo()
        {
            System.out.println("RAM SIZE IS : 8GB");
        }
    }

    //INNER CLASS
    class Proccessor
    {
        void displayName()
        {
            System.out.println("SNAPDRAGON");
        }
    }
}
