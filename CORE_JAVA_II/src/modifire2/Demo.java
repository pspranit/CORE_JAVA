package modifire2;

import modifire1.Master;

public class Demo extends Master {
    public static void main(String[] args) {

        Demo d1=new Demo();
        //System.out.println("A VALUE IS :"+d1.a);  ERROR (PRIVATE)
       // System.out.println("B VALUE IS :"+d1.b);  DEFAULT
        System.out.println("C VALUE IS :"+d1.c);    //PROTECTED (IS-A)
        System.out.println("D VLAUE IS :"+d1.d);    //PUBLIC
    }
}
