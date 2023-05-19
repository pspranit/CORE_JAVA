import com.sun.source.tree.Tree;

import java.util.Set;

public class Test {

    //********************************Answer=int**************************************************************

//    public void print(Integer i) {
//        System.out.println("Integer");
//    }
//
//    public void print(int i) {
//        System.out.println("int");
//    }
//
//    public void print(long i) {
//        System.out.println("long");
//    }


//    public static void main(String args[]){
//        Test test =new Test();
//        test.print(10);
//
//
//    }
    //********************************Answer=15**************************************************************

//    public static void main(String[] args) {
//        for (int i = -10; i < 5; i++) {
//            System.out.print(i+" ,");
//        }
//    }


    //************************************* Answer=4 *********************************************************

//    public static void main(String[] args) {
//
//        int x=0,y=10,sum=0;
//        for ( x = 1; x < 5; x++)
//        {
//            if(y>5)
//            {
//                sum=0;
//            }
//            sum=sum+x++;
//            y=sum-x;
//        }
//        System.out.println(sum);
//    }

    //********************************* Answer=654 *************************************************************

//    public static void main(String[] args) {
//
//       int i=3;
//
//       do {
//           System.out.print(i+3+",");
//           i=i-1;
//       }while (i!=0);
//    }

    //************************************ Answer=36 **********************************************************

//    public static void main(String[] args) {
//
//        int first=0,second=10,third=40,total=0;
//
//        for ( first = 1; first < 2; first++) {
//            if(second>5)
//            {
//                total=0;
//            }
//            total=total+first++;
//            third-=first+first;
//        }
////        System.out.println(total);
//        System.out.println(third);
//    }
    //********************************** Answer=123 ************************************************************

//    public static void main(String[] args) {
//        int x=1;
//        do {
//            System.out.print(x+",");
//            if(x++==5)
//            {
//                x=0;
//            }
//        }while (x+1<5);
//    }

    //************************************ answer=2468 **********************************************************
//    int main()
//    {
//
//        int i,j;
//        for(i=1;i<5;j++)
//        {
//            for(j=1;j<5;j++)
//            {
//                printf("%d",i++ + j);
//            }
//        }
//    }

    //*************************** answer=3 infinite loop *******************************************************************
//    public static void main(String[] args) {
//        Integer n;
//        for (n=3; n>0 ; n--) {
//            System.out.print(n+",");
//            n=n+1;
//        }
//    }


    //************************************ answer=a=10,b=20 **********************************************************

//    public static void main(String[] args) {
//
//        int a=10;
//        int b=20;
//
//        swapnum(a,b);
//        System.out.println(a+" "+b);
//    }
//        static void swapnum(int i,int j)
//        {
//            int temp;
//            temp=i;
//            i=j;
//            j=temp;
//        }

    //********************************* answer=15 28 *************************************************************

//    public static void main(String[] args) {
//        int a=15;
//        int b=--a + a++;
//        System.out.println(a+" "+b);
//
//    }

    //**************************** answer=77 ******************************************************************

//   static int function(int num)
//    {
//        if(num>0)
//        {
//            return (num+function(num-3));
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//
//        System.out.println(function(20));
//    }

    //************************************ answer=13 **********************************************************


//    static int function(int x,int y)
//    {
//        if(x==0)
//        {
//            return y;
//        }
//
//        return function(x-1,x+y);
//    }
//    public static void main(String[] args) {
//
//        System.out.println(function(4,3));
//    }

    //**************************** 8 *****************************************
//    public static void main(String[] args) {
//        int i=0;
//        do {
//            i++;
//            if(i<=2) {
//                continue;
//            }
//        }while (i<8);
//        System.out.print(i+",");
//    }

    //***************************** answer=20 *****************************************************************


//        int main()
//        {
//
//            int x=10, *ptr;
//            ptr=&x;
//	          *ptr=20;
//            printf("%d",x);
//        }
//    }

    //**************************************** answer=21 ******************************************************


//    public static void main(String[] args) {
//        int t=6,h=9,x=0;
//        Integer c;
//        if(h>t)
//        {
//        for (c=t;c<h;c=c+1)
//        {
//            x=x+c;
//        }
//            System.out.print(x+" ,");
//        }
//        else {
//            System.out.println("ERROR"+x+",");
//        }
//
//    }

    //************************************* answer=20 *********************************************************
//  static Integer function (Integer a,Integer b)
//    {
//        if(a>0)
//        {
//         if (b>0)
//         {
//             return a+b+function(a+1,0)+function(a+2,0)+function(a+3,0);
//         }
//        }
//        return a+b;
//    }
//    public static void main(String[] args) {
//
//        System.out.println(function(2,6));
//    }


    //*********************************** Natural number ***********************************************************

//    public static void main(String[] args) {
//
//        int i=0,j=0;
//        for ( i = 1; i < 10; j++) {
//            for ( j = 0; j < 10 ; i++) {
//                System.out.print(" "+ i + j++);
//            }
//        }
//    }

    //*********************************** x=11 y=6 ***********************************************************
//    public static void main(String[] args) {
//
//        int x=6;
//        int y=5;
//
//        x--;
//
//        y=x-3;
//
//        for (int i=0;i<4;++i)
//        {
//            y++;
//        }
//        x+=y;
//        System.out.println(x+" ,"+y);
//    }

    //**************************** 123 *****************************************

//    public static void main(String[] args) {
//
//        int j=0;
//        int i=0;
//        int a,b,c;
//         a=i++ + j++;
//         b=a++ + i +j;
//         c=b+a;
//        System.out.println(a+" ,"+b+" ,"+c);
//    }

    //**************************** true true *************************************

//    public static void main(String[] args) {
//
////        function (true);
//        function(false);
//    }
//
//    private static void function(boolean a) {
//
//        boolean b=!a;
//        boolean c=!(!b && !a);
//
//        if (!c != !a)
//        {
//            System.out.println("true");
//        }
//        else {
//            System.out.println("true");
//        }
//    }

    //**************************** 10 *****************************************

//    public static void main(String[] args) {
//        int p=9;
//        int w=6;
//
//        p=p+1;
//        w=w-1;
//
//        if(p>w)
//        {
//            System.out.println(p);
//        }
//        else {
//            System.out.println(w);
//        }
//    }

    //**************************** 0 *****************************************

//    public static void main(String[] args) {
//
//        int a,b,c,d;
//        a=16;
//        b=15;
//        c=32;
//
//        d=(a|b)&c;
//        System.out.println(d);
//
//    }

    //**************************** 5 *****************************************
//    public static void main(String[] args) {
//
//        int a=4;
//        int b=5;
//        int c= a ^ b ^ a;
//        System.out.println(c);
//    }

    //**************************** 68 *****************************************
//    public static void main(String[] args) {
//
//        int p =4,q=5,r=9;
//        q=(p+8)+p;
//        if((2-r-q)>(q-p)) {
//            r = (11 + 12) + q;
//        }
//        else
//            {
//                p = (p + 5) + q;
//                q = (q + 9) + r;
//            }
//
//    if(9<r)
//    {
//    p=(11+12)+r;
//}
//        System.out.println(p+q+r);
//
//    }

    //**************************** 0 OR 16 *****************************************

//    public static void main(String[] args) {
//
//        System.out.println(x(5));
//    }
//
//     static int x(int n) {
//
//        if(n==0 || n==1)
//        {
//            return 0;
//        }
//        return x(n-1) + x(n-2);
//    }

//    public static void main(String[] args) {
//
//        System.out.println(divisible(2630));
//    }
//
//    public static int divisible(int number) {
//
//        int even_counter=0,num_remainder=number,digit;
//
//       while (num_remainder)
//       {
//           digit=num_remainder % 10;
//           if (digit!=0 && number % digit==0)
//           {
//               even_counter=even_counter+1;
//           }
//       }
//       return even_counter;
//    }

    //**************************** 3,4 *****************************************

//    public static void main(String[] args) {
//        int a=4;
//        int b=(a++) + (--a) -(a--);
//        System.out.println(a+" ,"+b);
//    }


    //**************************** 1 3 2 4 5 *****************************************

//    abstract class Car{
//        static {
//            System.out.println("1");
//        }
//        public Car(String name)
//        {
//            super();
//            System.out.println("2");
//        }
//        {
//            System.out.println("3");
//        }
//    }
//    public class BlueCar extends Car {
//
//        {
//            System.out.println("4");
//        }
//        public BlueCar()
//        {
//            super("blue");
//            System.out.println("5");
//        }
//        public static void main(String[] args) {
//            new BlueCar();
//        }
//    }

    //**************************** compile time error *****************************************

//    public static void main(String[] args) {
//        int a=1,b=2,c;
//        c=b<<a;
//        b=c * (b *(++a)--);
//        a=a>>b;
//        System.out.println(b);
//    }

//    public static void main(String[] args) {
//
//      int e=7,f=8;
//        System.out.println(work(e,f));
//    }
//
//    private static int work(int e, int f) {
//        if(e<f)
//        {
//            return work(f,e);
//        } else if (f!=0) {
//            return (e+work(e,f-1));
//        }
//        else {
//            return 0;
//        }
//    }

}