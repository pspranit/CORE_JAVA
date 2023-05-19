package IS_A_inheritance;

class Employee      //SUPER CLASS
{
    void getInfo(int empId,double salary)
    {
        System.out.println("EMP_ID: "+empId);
        System.out.println("EMP SALARY: "+salary);
    }
}

class PermanentEmployee extends Employee    //CHILD CLASS 1
{
    void getDesignation(String desig)
    {

        System.out.println("DESIGNATION IS: "+desig);
    }
}

class ContractEmployee extends Employee     //CHILD  CLASS 2
{
    void getContractDetails(int months)
    {

        System.out.println("CONTARCT DURATION: "+months+" MONTHS");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {

    PermanentEmployee p=new PermanentEmployee();
    p.getInfo(101,50000);
    p.getDesignation("ANALYST");

        System.out.println("################################");

    ContractEmployee c=new ContractEmployee();
    c.getInfo(102,100000);
    c.getContractDetails(24);

    }
}
