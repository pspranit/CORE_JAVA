package collectionframework;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //non-generic ArraList
        ArrayList data=new ArrayList();
        data.add(10);
        data.add(20.00);
        data.add(true);
        data.add(null);
        data.add('A');
        data.add("JAVA");

        System.out.println(data);
    }
}
