public class RevString {
    public static void main(String[] args) {
        String name="pranit";
        System.out.println("String\n"+name);
		
        int leng=name.length();
        String rev="";
        for(int i=leng-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("reverse String\n"+rev);

    }
}

