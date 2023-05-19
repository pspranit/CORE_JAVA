package method_overloading;

public class Facebook {
    String email_id="pspranitsahane143@gmail.com";
    String pass="pass123";
    long cont_no=8605826881l;

    void login(String email,String password)
    {
        if(email_id.equalsIgnoreCase(email) && pass.equals(password))
        {
            System.out.println("YOUR EMAIL "+email);
            System.out.println("PASSWORD "+pass);
        }
        else {
            System.out.println("RECORD NOT FOUND");
        }
    }

    void login(long cNO,String password)
    {
        if(cNO==cont_no && pass.equals(password))
        {
            System.out.println("YOUR CONTACT NO "+cont_no);
            System.out.println("PASSWORD "+pass);
        }
    }

}
