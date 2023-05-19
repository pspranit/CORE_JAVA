import java.util.Scanner;

public class UserName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER TOTAL NO OF USERS");
        int user = sc.nextInt();

        for (int i = 1; i <= user; i++) {
            System.out.println("ENTER USERNAME");
            String name = sc.next();
            System.out.println("WELCOME=>" + name);

        }
    }

}

