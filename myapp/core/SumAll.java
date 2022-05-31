package myapp.core;

public class SumAll {
    
    public static void main(String[] args) { 
        
        System.out.println("SumAll");

        int result = 0;

        // Get access to all the numbers
        for (int i =0; i < args.length; i++) {
            System.out.printf("%s\n", args[i]);
            int operand = Integer.parseInt(args[i]);
            result+=operand;
        }
        // Print the array
        System.out.printf("The sum is %d", result);



    }

}