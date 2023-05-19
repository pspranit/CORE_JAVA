package encapsulation;

public class Anonymous {

    public static void main(String[] args) {

        Shape s1=new Shape(){

            @Override
            public void area() {     //Anonymous
                double result=3.14*5*5;
                System.out.println("AREA OF CIRCLE :"+result);

            }
        };
        s1.area();

        Shape s2=new Shape() {   //Anonymous
            @Override
            public void area() {
                double result=0.5*4*5;
                System.out.println("AREA OF TRIANGLE :"+result);

            }
        };
        s2.area();
    }
}
