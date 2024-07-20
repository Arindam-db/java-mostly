package HelloApp;

import java.util.Scanner;

public class while01 {
    public static void main(String[] args){
        //while loop executes a blockof code aslong as its condition remains true

        Scanner scan = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("please enter ur Name: ");
            name = scan.nextLine();
        }
        System.out.println("name stored succesfully as "+name);
    }
    
}
