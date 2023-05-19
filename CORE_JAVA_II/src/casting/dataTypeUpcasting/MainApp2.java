package casting.dataTypeUpcasting;
class TV
{
    void displayPicture()
    {
        System.out.println("DISPLAY PICTURE");
    }
}

class LCD extends TV{
    void streamingQuality()
    {
        System.out.println("FULL HD");
    }
}

class LED extends TV{
    void streamingQuality()
    {
        System.out.println("4K HD");
    }
}

public class MainApp2 {
    public static void main(String[] args) {

        TV t1;
        t1=new LCD();   //UPCASTING
        t1.displayPicture();

        t1=new LED();   //UPCASTING
        t1.displayPicture();

//        TV t1=new LED();
//        t1.displayPicture();
//
//        t1=new LCD();
//        t1.displayPicture();
    }
}
