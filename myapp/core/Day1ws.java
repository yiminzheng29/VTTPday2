package myapp.core;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Day1ws {

    public static void main(String[] args) { 

        String input;
        int delIndex;

        System.out.println("Welcome to your shopping cart");

        List<String> cart = new LinkedList<>();
        // Get the console
        Console cons = System.console();

        // Control the loop
        boolean stop = false;

        while (!stop) {
            input = cons.readLine("> ");

            // add <list of space separated item>
            // list
            // del
            // end
            String[] terms = input.split(" ");

            switch (terms[0]) {
                case "add":
                    for (int i=0; i <= cart.size(); i++) {
                        System.out.printf("%s added to cart\n", terms[i+1]);
                    }
                break;

                case "list":
                    if (cart.size() > 0) {
                        for (int i =0; i< cart.size(); i++) {
                            System.out.printf("%d. %s\n", (i+1), cart.get(i));
                        }
                    }  

                    else {
                        System.out.println("Your cart is empty");
                    }
                    break;

                case "del":
                    if (terms.length <2) {
                        System.err.println("Please provide an index to delete");
                    }
                    else {
                        delIndex = Integer.parseInt(terms[1]) - 1;
                        if (delIndex < cart.size()) {
                            cart.remove(delIndex);
                            System.out.println("Deleted");
                        }
                        else {
                            System.err.println("No such item");
                        }

                    }
                    break;


                case "end":
                    break;
            }

            System.out.printf("%s\n", input);

        }

    }
}

