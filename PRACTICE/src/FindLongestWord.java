import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindLongestWord {

    public static void main(String[] args) {

        String str="pranit sahebrao sdjflsdjilfjsldjljf sahane ";

        String arr[]=str.split(" ");

        HashSet<String> data=new HashSet<>();

        String largestWord="";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[j].length()>=arr[i].length())
                {
                    largestWord=arr[j];
                }
                else {
                    data.add(arr[i]);
                    data.add(arr[j]);
                }
            }


        }
        System.out.println(largestWord);
        System.out.println(data);
    }
}
