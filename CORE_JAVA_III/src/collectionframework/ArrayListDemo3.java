package collectionframework;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //generic ArrayList
        ArrayList <String> data=new ArrayList<>();

        data.add("JAVA");
        data.add("SQL");
        data.add("PYTHON");
        data.add("WEB TECH");

        //option 1
        System.out.println(data);
        System.out.println("******************************");
        //option 2

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        System.out.println("******************************");

        for(String s:data)
        {
            System.out.println(s);
        }
    }
}
