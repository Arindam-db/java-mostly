package HelloApp;

import javax.swing.JOptionPane;

public class string01 {
    public static void main(String[] args){
        // a string is a reference data type that can store one or more data types
        //reference data types have acess to useful methods

        String name = "Arindam";

        String nametyped = JOptionPane.showInputDialog( null, "enter ur name");
        nametyped = nametyped.trim(); //removes the empty spaces

        boolean res = name.equals(nametyped);
        JOptionPane.showMessageDialog(null, "Your name is "+ res);
    }
    
}
