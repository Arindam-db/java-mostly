package HelloApp;

import javax.swing.JOptionPane;


public class gui_intro {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter ur name:");

        if (name.equals("arindam") || name.equals("Arindam")) {
            JOptionPane.showMessageDialog(null, "Hello " +name);            
        } else {
        JOptionPane.showMessageDialog(null, "no hello "+name);
        }
    }
}
