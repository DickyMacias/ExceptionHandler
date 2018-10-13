
package exceptionhandler;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ExceptionHandler2 {
    public static void main(String[] args) {
    
   
        int n = 0;
        boolean goodInput = false;
        
        String s = JOptionPane.showInputDialog(null, "Enter an integer");
        
        do{
               try{
                       
                       n = Integer.parseInt (s);
                       goodInput = true;
               }    
               catch (NumberFormatException nfe) {
                   s = JOptionPane.showInputDialog(null, s + " is not an integer." + "Enter sn integer");
               }
        }
        while ( !goodInput);
        JOptionPane.showMessageDialog(null, "The integer is " + n);
    }
    
}
