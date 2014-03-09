/*
 * Name: Jeremy Parris
 * March 6, 2013
 *
 */

package hello.world;


public class UserInterface 
{
    //class level private variables
    private String first;
    private String last;
    
    //constructor for first and last name that is entered by the user
    public UserInterface(String firstName, String lastName)
    {
        first = firstName;
        last = lastName;
    }
    
    //method returns last name
    public String getLast()
    {
        return last;
    }
    
    //method returns first name
    public String getFirst()
    {
        return first;
    }
}
