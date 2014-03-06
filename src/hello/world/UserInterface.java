/*
 * Name: Jeremy Parris
 * March 6, 2013
 *
 */

package hello.world;


public class UserInterface 
{
    private String first;
    private String last;
    
    public UserInterface(String firstName, String lastName)
    {
        first = firstName;
        last = lastName;
    }
    
    public String getLast()
    {
        return last;
    }
    
    public String getFirst()
    {
        return first;
    }
}
