package interfaces;

public class Software extends FrontEnd implements BackEnd,DataBase{

    @Override
    public void developServerProgram(String language) {
        System.out.println("DEVELOPING SERVER PROGRAM :"+language);
    }

    @Override
    public void designDatabase(String dbVendor) {
        System.out.println("DESIGNING DATABASE :"+dbVendor);
    }
}
