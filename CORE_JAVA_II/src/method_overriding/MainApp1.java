package method_overriding;

class Demo{

    void display()
    {
        System.out.println("SUPER CLASS DISPLAY METHOD");
    }
}

class Sample extends Demo{
    void display(){
        System.out.println("SUB CLASS DISPLAY METHOD ");
    }
}

public class MainApp1 {
    public static void main(String[] args) {

        Sample s1=new Sample();
        s1.display();
    }
}
