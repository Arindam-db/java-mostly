package HelloApp;
import javax.swing.JOptionPane;


public class gui_intro {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter ur name:");
        JOptionPane.showMessageDialog(null, "Hello "+name);
    }
}
