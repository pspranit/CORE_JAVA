package method_overloading;

class Student
{
    String name="PRANIT";
    long cont_no=8605826881l;

    void search(String studentName)
    {
        if (studentName.equalsIgnoreCase(name))
        {
            System.out.println("STUDENT NAME : " + name);
            System.out.println("STUDENT CONTACT NO : "+cont_no);
        }
        else {
            System.out.println("RECCORD NOT FOUND");
        }
    }

    void search(long cNo) {
        if (cont_no == cNo) {
            System.out.println("STUDENT NAME IS " + name);
            System.out.println("STUDENT CONTACT NO " + cont_no);
        }
        else {
            System.out.println("RECCORD NOT FOUND");
        }
    }
}
