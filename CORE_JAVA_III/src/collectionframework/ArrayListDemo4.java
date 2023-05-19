package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList <Integer> data=new ArrayList<>();
        data.add(50);
        data.add(10);
        data.add(100);
        //option 4 Iterator Interface
        //multiple operations
        Iterator <Integer> itr= data.iterator();
        while(itr.hasNext())
        {
            if(itr.next()==10)      //fetch
            {
                itr.remove();       //delete
            }
        }
        System.out.println(data);
    }
}
