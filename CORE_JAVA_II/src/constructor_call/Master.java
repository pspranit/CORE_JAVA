package constructor_call;

public class Master {
    Master(int a)
    {
        System.out.println("VALUE OF A:"+a);
    }
    Master(String s)
    {
      this(10);
        System.out.println("VALUE OF S:"+s);
    }
    Master(char c)
    {
        this("pranit");

        System.out.println("VALUE OF C:"+c);
    }
}

