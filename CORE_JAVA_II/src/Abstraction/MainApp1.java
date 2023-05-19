package Abstraction;

public class MainApp1 {
    public static void main(String[] args) {

        Switch s1;

        s1=new LEDLight();
        s1.switchOn();
        s1.switchOff();

        s1=new CFLLight();
        s1.switchOn();
        s1.switchOff();
    }
}
