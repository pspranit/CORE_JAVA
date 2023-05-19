package casting;

public class CastingDemo3 {
    public static void main(String[] args) {

        char ch1='J';
        char ch2='P';

        int x1=ch1;
        int x2=ch2;
        System.out.println(x1+"\t\t"+x2);

        int x3=97;
        char ch3=(char)x3;
        System.out.println(ch3);

        double d=65.0564;
        char ch4=(char)d;
        System.out.println(ch4);
    }
}
