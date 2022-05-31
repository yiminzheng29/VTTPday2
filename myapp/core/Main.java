package myapp.core;


public class Main {

    public static void main(String[] args) {

        System.out.println("good morning");

        // Instantiate the array
        String[] todos = new String[5];

        // Assign some value
        todos[0] = "learn Java";
        todos[1] = "go jogging";
        todos[2] = "watch a movie";

        System.out.printf("Index: %d: value = %s\n", 0, todos[0]);
        System.out.printf("Index: %d: value = %s\n", 1, todos[1]);
        System.out.printf("Index: %d: value = %s\n", 2, todos[2]);

        // Every array has a property called length
        System.out.printf("Size of array: %d\n", todos.length);


        System.out.printf("Size of args: %d\n", args.length);
        System.out.printf("Index: %d: value= %s\n",0, args[0]);
        System.out.printf("Index: %d: value= %s\n", 1, args[1]);

    } 
}