package casting.classTypeCasting;

import java.util.Scanner;

class TV
{
    void displayPicture()
    {
        System.out.println("DISPLAY PICTURE");
    }
}

class LED extends TV
{
    void streamingQuality()
    {
        System.out.println("FULL HD");
    }
}

class LCD extends TV
{
    void streamingQuality()
    {
        System.out.println("4K HD");
    }
}

public class MainApp2 {
    public static void main(String[] args) {

        //TV t1;
        TV t1=new LCD();
        t1.displayPicture();    //Upcasting

        t1=new LED();
        t1.displayPicture();    //Upcasting

        LCD l1;
        l1=new LCD();
        l1.streamingQuality();
        l1.displayPicture();






        }
}
