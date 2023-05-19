import java.util.Scanner;

interface client
{
    void input();
    void output();
}
class PRANIT implements client
{
    String name;
    double sal;

    public void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Name:");
        name=s.nextLine();

        System.out.println("enter salary");
        sal=s.nextDouble();
    }
    public void output()
    {
        System.out.println(name+"  "+sal);
    }
    public static void main(String Arg[])
    {
        client c=new PRANIT();
        c.input();
        c.output();
    }
}