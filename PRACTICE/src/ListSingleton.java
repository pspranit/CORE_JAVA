import java.util.*;

public class ListSingleton {
    public static void main(String[] args) {

        String [] data={ "1", "2", "4", "2", "1", "2",
                "3", "1", "3", "4", "3", "3" };

        List list=new ArrayList(Arrays.asList(data));
        System.out.println(list);

        List list1=new ArrayList(Arrays.asList(data));

        list1.removeAll(Collections.singleton("1"));

        list1.removeAll(Collections.singleton("3"));
        System.out.println(list1);

        
    }


}
