package myapp.core;

public class xmastreeAnswer {
    public static void main(String[] args) { 
        int rows = 5;
        int height = 3;

        for (int h=0;h<height;h++) {
            for (int i=0; i<rows; i++) {
                for (int c = 0; c < i +1; c++) {
                System.out.print("*");

                }
                System.out.println("");
            }
        }   
    }
}
