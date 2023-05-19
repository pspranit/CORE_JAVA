package encapsulation;

public class Employee {

    private int empId=101;
    private double empsalary=15000;

    public int getEmpId() {
        return empId;
    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;

    }

    public void setEmpsalary(double empsalary) {
        if(empsalary>0) {
            this.empsalary = empsalary;
        }
       else {
            System.out.println("INVALID AMMOUNT");
        }
    }
}
