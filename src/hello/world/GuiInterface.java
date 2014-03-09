/*
 * Jeremy Parris
 * March 8, 2014
 */

package hello.world;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GuiInterface extends JFrame
{
    //panel object
    JPanel mypanel;
    
    //label objects
    JLabel lblFirstName;
    JLabel lblLastName;
    JLabel lblResult;
    
    //textfield objects
    JTextField txtFirstName;
    JTextField txtLastName;
    
    //button objects
    JButton btnName;
    JButton btnClear;
    JButton btnExit;
    
    //gui constructor
    public GuiInterface()
    {
        //adds panels
        mypanel = new JPanel();
        
        //all gui objects created and parameters set
        lblFirstName = new JLabel("Enter your first name here:  ");
        txtFirstName = new JTextField(10);
        lblLastName = new JLabel("  Enter your last name here:  ");
        txtLastName = new JTextField(10);
        btnName = new JButton("Go");
        btnClear = new JButton("Clear");
        lblResult = new JLabel();
        btnExit = new JButton("Exit");
        
        //all gui objects are added to the panel
        mypanel.add(lblFirstName);
        mypanel.add(txtFirstName);
        mypanel.add(lblLastName);
        mypanel.add(txtLastName);
        mypanel.add(btnName);
        mypanel.add(btnClear);
        mypanel.add(btnExit);
        mypanel.add(lblResult);
        
        this.add(mypanel);
        
        //call event handler anonymonous inner private class
        TextFieldHandler handler = new TextFieldHandler();
        
        //event handlers are set to all three buttons in the gui
        btnName.addActionListener(handler);
        btnClear.addActionListener(handler);
        btnExit.addActionListener(handler);
    }   
    
    //inner private class that contains the events handlers for button click
   private class TextFieldHandler implements ActionListener
   {

        @Override
        public void actionPerformed(ActionEvent event) 
        {
            String first;
            String last;
            
           //event handler for the go button
            if(event.getSource() == btnName)
            {
                 first = txtFirstName.getText();
                 last = txtLastName.getText();
                 
                 UserInterface ui = new UserInterface(first, last);
                 
                 lblResult.setText(" Hello " + ui.getFirst() + " " + ui.getLast());
            }
            
            // event handler for the clear button
            if(event.getSource() == btnClear)
            {
                txtFirstName.setText("");
                txtLastName.setText("");
            }
            
            //event handler for the exit button
            if(event.getSource() == btnExit)
            {
                System.exit(0);
            }
        }
       
   }
}
