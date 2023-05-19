package StringPractice;

public class RemoveChar {
    public static void main(String[] args) {

        String str="sahane";

        String newStr="";
        String delStr="";

//        int n=str.length();

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)!='a')
            {
                newStr=newStr+str.charAt(i);
            }
            else {
                delStr=delStr+str.charAt(i);
            }
        }
        System.out.println("ORIGNAL STRING : "+str);
        System.out.println("AFTER REMOVED CHAR STRING : "+newStr);
        System.out.println("REMOVED CHARACTER : "+delStr);
    }
}