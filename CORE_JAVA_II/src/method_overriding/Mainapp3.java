package method_overriding;

class Qspiders
{
    void qInfo(String teacherName,String subject)
    {
        System.out.println("TEACHER NAME: "+teacherName);
        System.out.println("SUBJECT: "+subject);
    }
}

class Developer extends Qspiders
{
    void qInfo(String teacherName ,String subject)
    {
        System.out.println("TEACHER NAME: "+teacherName);
        System.out.println("SUBJECT: "+subject);
    }
}

class Tester extends Qspiders
{
    void qInfo(String teacherName ,String subject)
    {
        System.out.println("TEACHER NAME: "+teacherName);
        System.out.println("SUBJECT: "+subject);
    }
}

public class Mainapp3 {
    public static void main(String[] args) {

        Developer d1=new Developer();
        d1.qInfo("Akshay sir","J2EE");

        System.out.println();

        Tester t1=new Tester();
        t1.qInfo("Anvesh sir","MANUAL");
    }
}
