//interface Organization
//{
//    void organizationInfo();
//
//   class AccountDept implements Organization {
//        void account()
//        {
//            System.out.println("ACCOUNT DEPT");
//        }
//
//       @Override
//       public void organizationInfo() {
//           System.out.println("organizationInfo");
//       }
//   }
//
//    class ScienceDept extends AccountDept{
//        void science()
//        {
//            System.out.println("SCIENCE DEPT");
//        }
//    }
//}

interface Pranit{

    int addition();
}

class Pranit2 implements Pranit{

    @Override
    public int addition() {
        return 10+20;
    }
}

public class EncapsulationOrg extends Pranit2{
    public static void main(String[] args) {
//        Organization.AccountDept accountDept=new Organization.AccountDept();
//        accountDept.account();
//        accountDept.organizationInfo();
//
//        Organization.ScienceDept scienceDept=new Organization.ScienceDept();
//        scienceDept.science();

      Pranit pranit= () -> 20+50;
        System.out.println(pranit.addition());

        Pranit pranit1=() -> 10*2;
        System.out.println(pranit1.addition());

        Pranit2 pranit2=new Pranit2(){

            @Override
            public int addition() {
                return super.addition();
            }
        };
        System.out.println(pranit2.addition());
    }
}
