package myapp.core;

import java.io.Console;

public class Christmastree {

    public static void main(String[] args) { 

        // Get the console
        Console cons = System.console();

        String input;

        input = cons.readLine("");
        int input2 = Integer.parseInt(input);

        for (int i=0; i<=input2; i++) {
            String result = new String(new char[i]).replace("\0", "*");
            System.out.println(result);
        }


    }

}