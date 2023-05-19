import java.net.SocketTimeoutException;

abstract class Demo{
    public int i,j;
    public Demo()
    {
    System.out.println("Inside Constructor Demo");
    }
    public void fun()
    {
        System.out.println("Inside Fun of Demo");
    }
    public void gun()
    {
        System.out.println("Inside gun of Demo");
    }

    public abstract void sun();
}

class Hello extends Demo{
    public int x,y;
    public Hello(){
        System.out.println("Inside Constructor Hello);
        x=10;
        y=20;
    }
    public void fun(){
        System.out.println("inside Fun Hello");
    }
    public void sun()
    {
        System.out.println("Inside sun of Hello");
    }
}
public class AbstaractDemo {
    //Demo obj=new Demo();
    Demo obj;
    obj=new Hello;
    obj.fun();
    obj.gun();
    obj.sun();

    System.out.println(obj.i);
    System.out.println(obj.j);
    }
}
