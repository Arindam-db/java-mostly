package HelloApp;

import java.util.Scanner;

public class if_statements {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("enter ur age: ");
        int age = scan.nextInt();
    
        if(age >= 18 && age < 150) // the if should be printing iff both the statements are true
        {
            System.out.println("you are an adult");
        }
        if(age<18) {
            System.out.println("tu jaa ree ... bacche");
        }
        else if (age>150){
            System.out.println("tu zinda hai ?");
        }
    }
}
