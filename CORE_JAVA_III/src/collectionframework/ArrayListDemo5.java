package collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList <Character> data=new ArrayList<>();
        data.add('S');
        data.add('Q');
        data.add('L');
        //option 5 ListIterator Interface
        ListIterator<Character>itr=data.listIterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        while(itr.hasPrevious())
        {
            System.out.print(itr.previous()+" ");
        }
    }
}
