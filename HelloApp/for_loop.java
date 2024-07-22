package HelloApp;

import javax.swing.JOptionPane;

public class for_loop {
    public static void main(String[] args){
        //executes a block of code a limited times

    //here i = index 
    /* for(int i = 0; i <= 10 ; i++) {
        JOptionPane.showMessageDialog(null,i);
        } */


        //another varient
        for(int i = 0; i <= 10 ; i+=2) {
            JOptionPane.showMessageDialog(null,i);
        }
        JOptionPane.showMessageDialog(null,"done completed!");
    }
}
