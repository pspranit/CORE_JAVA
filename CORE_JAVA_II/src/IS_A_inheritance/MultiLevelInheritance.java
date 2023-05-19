package IS_A_inheritance;

class WhtasAppV1    //SUPER CLASS
{
    void chating()
    {
        System.out.println("CHAT WITH FRIEND");
    }
}

class WhatsAppV2 extends WhtasAppV1     //CHILD/SUPER CLASSS
{
    void calling()
    {
        System.out.println("MAKE AND RECEIVE CALL");    //CHILD CLASS
    }
}

class WhatsAppV3 extends WhatsAppV2
{
    void payment()
    {
        System.out.println("MAKE A PAYMENT");
    }
}
public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        WhatsAppV3 v=new WhatsAppV3();
        v.chating();
        v.calling();
        v.payment();
    }
}
