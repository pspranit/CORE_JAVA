package encapsulation;

public class Inner {
    public static void main(String[] args) {

        Mobile m1=new Mobile();
        System.out.println("COMPANY NAME IS :"+m1.companyName);

        //Encapulation
        Mobile.RAM r1=m1.new RAM();
        r1.displayInfo();

        //Encapsulation
        Mobile.Proccessor p1=m1.new Proccessor();
        p1.displayName();
    }
}
