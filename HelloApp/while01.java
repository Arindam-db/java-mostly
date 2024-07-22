package HelloApp;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class while01 {
    public static void main(String[] args){
        //while loop executes a blockof code aslong as its condition remains true


        //name print using while loop
        Scanner scan = new Scanner(System.in);
        String name = "";


        //while loop
        while(name.isBlank()){
            System.out.println("please enter ur Name: ");
            name = scan.nextLine();
        }
        System.out.println("name stored succesfully as "+name);


        //do while loop similar to while loop
        /* do{
            System.out.println("please enter ur Name: ");
            name = scan.nextLine();
        }while(name.isBlank())
        System.out.println("name stored succesfully as "+name); */



        //print name using while loop gui
        /* String name ="";
        while (name.isBlank()) {
            name = JOptionPane.showInputDialog("enter ur name");
        }
        
        JOptionPane.showMessageDialog(null,"Hello "+name); */

    }
    
}
