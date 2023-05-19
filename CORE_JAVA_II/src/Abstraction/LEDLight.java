package Abstraction;

public class LEDLight implements Switch {

    public void switchOn()
    {
        System.out.println("LED LIGHT SWITCHED ON");
    }

    public void switchOff()
    {
        System.out.println("LED LIGHT SWITCHED OFF");
    }
}
