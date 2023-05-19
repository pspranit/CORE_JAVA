//
//class Demo
//{
//    public int i,j;
//    public static int x,y;
//
//    static
//    {
//        System.out.println("Inside static block");
//        x=10;
//        y=20;
//    }
//    public Demo()
//    {
//        System.out.println("Inside constructor");
//        i=10;
//        j=20;
//    }
//}
//
//
//
//class StaticBlock
//{
//    public static void main(String arg[])
//    {
//        System.out.println("Inside main");
//        //System.out.println(Demo.x);
//
//        Demo obj1=new Demo();
//        Demo obj2=new Demo();
//
//    }
//}

import java.util.ArrayList;

//public class Demo{
//    public static void main(String[] args) {
//
//        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("pranit");
//        arrayList.add("sahane");
//        arrayList.add("Sahebrao");
//
//        String[] arr=new String[arrayList.size()];
//
//        arr=arrayList.toArray(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }
//}

class Thread1 extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("RUN EXECUTED");
            test();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void test() throws InterruptedException {

        int col=5;
        int star=1;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
                sleep(1000);
            }
            star++;
            System.out.println();
        }
        System.out.println();
    }

    }



public class Demo{
    public static void main(String [] args)
    {
        Thread1 t1=new Thread1();

        t1.start();
    }
}


