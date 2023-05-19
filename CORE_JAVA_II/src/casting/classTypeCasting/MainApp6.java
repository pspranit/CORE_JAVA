package casting.classTypeCasting;

class Bike
{
    void getType()
    {
        System.out.println("BIKE TYPE IS SHOW");
    }
}

class ElectricBike extends Bike
{
    void getType()
    {
        System.out.println("BIKE TYPE IS ELECTRIC");
    }
    void batteryInfo()
    {
        System.out.println("BATTERY SIZE 100 WALT");
    }
}
public class MainApp6 {
    public static void main(String[] args) {

    Bike b1=new ElectricBike(); //Upcasting
    b1.getType();
   // b1.batteryInfo();   //ERROR

        ElectricBike e1=(ElectricBike)  b1; //DownCasting
        e1.getType();
        e1.batteryInfo();
    }
}
