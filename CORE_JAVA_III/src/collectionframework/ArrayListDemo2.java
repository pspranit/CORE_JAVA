package collectionframework;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList <Integer> data=new ArrayList<>();

        data.add(10);
        //data.add(20.00);      ERROR
        data.add(30);

        System.out.println(data);
    }
}
