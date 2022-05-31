package myapp.core;

// import the collection framework
import java.util.*;

public class DataStructure {
    
    public static void main(String[] args) { 
        
        // Create a list of integer
        // List - generics
        LinkedList<Integer> intList = new LinkedList<Integer>();
        intList.add(Integer.parseInt("42"));
        intList.add(10);
        intList.add(50);
        intList.add(2, 15);

        System.out.println(intList);
        
        for (int i =0; i < args.length; i++) {
            System.out.printf("%d = %d\n", i, intList.get(i));

        }
    }

}