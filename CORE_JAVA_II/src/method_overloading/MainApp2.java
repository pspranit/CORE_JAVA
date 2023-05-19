package method_overloading;

public class MainApp2 {
    public static void main(String[] args) {

        Facebook f=new Facebook();
        f.login("pspranitsahane143@gmail.com","pass123");
        System.out.println();
        f.login(8605826881l,"pass123");
    }
}
