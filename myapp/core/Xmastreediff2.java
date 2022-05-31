// Christmas tree with spaces

package myapp.core;

import java.io.Console;

public class Xmastreediff2 {
    
    public static void main(String[] args) { 

        // Get the console
        Console cons = System.console();

        String input;

        input = cons.readLine("");
        int input2 = Integer.parseInt(input);

        if (input2>1) {
            for (int i=0; i<=input2; i++) {
                String result = new String(new char[i]).replace("\0", "* ");
                String result2 = new String(new char[(input2-i)]).replace("\0", " ");
                System.out.println(result2+result);
            }
        }

    }
}
