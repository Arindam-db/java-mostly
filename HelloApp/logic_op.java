package HelloApp;

import java.util.Scanner;

// && logical and 
// || logical or
// ! logical not

public class logic_op {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter p or q to check");
        
        String response = scan.next();

        if (response.equals("p") || response.equals("q")) {
            System.out.println("congrats you got p or q");            
        } else if (response.equals("g")){
            System.out.println("you got g");
        } else if (!response.equals("g") || !response.equals("p") || response.equals("q")){
            System.err.println("you failed");
        }
    }
}
