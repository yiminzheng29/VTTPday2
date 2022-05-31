// Christmas tree with duplicates

package myapp.core;

import java.io.Console;

public class Xmastreediff1 {
    
    public static void main(String[] args) { 

        // Get the console
        Console cons = System.console();

        String input;

        input = cons.readLine("");
        String[] terms = input.split(" ");

        int x = Integer.parseInt(terms[0]);
        

        if (terms.length>1) {
            int y = Integer.parseInt(terms[1]);
            for (int i=0; i<y; i++) { // outerloop with 2nd number
                for (int j=0; j<=x; j++) {
                    String result = new String(new char[j]).replace("\0", "* ");
                    System.out.println(result);
                } 
            }
        }

        else {
            for (int k=0; k<=x; k++) {
                String result2 = new String(new char[k]).replace("\0", "* ");
                System.out.println(result2);
            }
        }
    }
}

