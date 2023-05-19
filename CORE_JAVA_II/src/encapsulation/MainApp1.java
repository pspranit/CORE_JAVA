package encapsulation;

public class MainApp1 {
    public static void main(String[] args) {

        Employee e1=new Employee();
        //read private data through getter
        int id= e1.getEmpId();
        System.out.println(id);

        double salary=e1.getEmpsalary();
        System.out.println(salary);

        //Modify private data through setter
        e1.setEmpId(201);
        System.out.println(e1.getEmpId());

        e1.setEmpsalary(16000);
        System.out.println(e1.getEmpsalary());

    }
}
