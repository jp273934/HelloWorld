/*
 * Name: Jeremy Parris
 * March 6, 2014
 * 
 */

package hello.world;

import javax.swing.JFrame;




public class HelloWorld 
{
   
    //start up method that sets the parameters for the gui window
    public static void main(String[] args) 
    {
        GuiInterface gui = new GuiInterface();
        gui.setTitle("Hello World");
        gui.setSize(600, 100);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
}
    
}
