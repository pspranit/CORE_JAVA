public class Recurstion {
    public static void main(String[] args) {

        int seed=2;
        int steps=4;


        reccursion(seed,steps);

    }

    static int i=1;
    private static void reccursion(int seed, int steps) {

        int res=0;
        if(i<=4)
        {
            res=seed*i;
            System.out.println(seed+"*"+i+"="+res);
            i++;
            reccursion(seed,steps);
        }
    }
}
