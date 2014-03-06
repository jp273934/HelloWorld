/*
 * Name: Jeremy Parris
 * March 6, 2014
 * 
 */

package hello.world;

import javax.swing.JOptionPane;


public class HelloWorld 
{

    
    public static void main(String[] args) 
    {
        String first;
        String last;
        
        first = JOptionPane.showInputDialog("Enter your first name");
        
        last = JOptionPane.showInputDialog("Enter your last name" );
        
        UserInterface ui = new UserInterface(first, last);
        
        JOptionPane.showMessageDialog(null, "Hello " + ui.getFirst() + " " + ui.getLast());
        
    }
    
}
