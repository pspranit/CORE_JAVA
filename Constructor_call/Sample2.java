class Sample3 extends Demo3
{
    String name="pranit";
    long no=8605826881l;
    Sample3(int c,String name,long no)
    {
        super(25);//------> Declered by Programmer
        this.name=name;
        this.no=no;

        System.out.println("EXPLICIT SUB CLASS CONSTRUCTOR CALL");
        System.out.println(c+"\n"+name+" \n"+no);
    }
}