package HelloApp;

import java.util.Scanner;


public class nested_loops {
    public static void main(String[] args){
        //nested loops are loops inside a loop
        
        Scanner scan = new Scanner(System.in);
        int rows, coloumns;
        String symbol ="";

        System.out.println("Enter # of rows: ");
        rows = scan.nextInt();

        System.out.println("Enter # of coloumns: ");
        coloumns = scan.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scan.next();

        //outer loop
        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=coloumns; j++){
                System.out.print(symbol);
            }
        }
    }
    
}
