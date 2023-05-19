package method_overloading;

public class MainApp4 {
    //STANDARD MAIN METHOD
    public static void main(String[] args) {

        System.out.println("MAIN METHOD 1");
        main(10);
        main('P');
    }
    //EXTERNAL MAIN METHOD
    public static void main(int a) {
        System.out.println("MAIN METHOD 2");
        System.out.println(a);
    }

    public static void main(char b) {
        System.out.println("MAIN METHOD");
        System.out.println(b);
    }
}
