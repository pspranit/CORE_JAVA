package casting;

public class CastingDemo1 {
    public static void main(String[] args) {

        int a=30;
        double d=35.25;     //MATCH INFO
        System.out.println(a+"\t\t"+d);

        int a1=(int)40.25;      //NARROWING
        double d1=37;           //WIDENING
        System.out.println(a1+"\t\t"+d1);

    }
}
