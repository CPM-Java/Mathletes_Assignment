
/**
 * ArrayList Assignment
 * 
 * @author gk
 * @version 11/29/14
 */

import java.util.ArrayList;
import java.util.Random;

public class Roster
{
    /**
    You may NOT use System.out.print in this class.  All output is handled by the "GUI".
    
    Standard java arrays are forbidden
    */
    private ArrayList<Mathlete> team = new ArrayList<Mathlete>();
    
    //constructor Do Not Modify
    public Roster(ArrayList<String> names, String[] classes)
    {
        Random rand = new Random();
        for(String name: names){
            Mathlete geek = new Mathlete(name,classes[rand.nextInt(classes.length)],rand.nextInt(100));
            team.add(geek);
        }
    }
    
    /**
      Receives the name and graduating year from the "GUI".
      Checks the instance array of Mathlete objects to see if the name
      is already stored. If not, then it
      creates a new object of type Mathlete using the input parameters
      and stores that object in the instance ArrayList of Mathletes.
      Returns a String to the "GUI" which displays the current roster of 
      Mathletes.
     */
    public String addMathlete(String name, String gradClass)
    { 
        
        return "Add those Mathletes!!";
    }
    
      /**
      Receives the name from the "GUI".
      Checks the instance array of Mathlete objects to see if the name
      is stored. If it is, then it removes the object of type Mathlete and
      returns a String to the "GUI" which displays the current roster of 
      Mathletes, otherwise it returns a String warning the user that the name is invalid.
     */
    public String removeMathlete(String name)
    {

        return "Gotta perform, or you're off the roster!";
    }
    
      /**
      Receives the name and points as parameters from the "GUI".
      Checks the instance array of Mathlete objects to see if the name
      is stored. If it is, then it adds the points to the appropriate 
      object of type Mathlete and returns an updated String to the "GUI" 
      which displays the current roster of Mathletes, 
      otherwise it returns a String warning the user that the name is invalid.
     */
    public String addPoints(String name, int points)
    {   

        return "Score!!!";
    }
    
    
    /**
     * A team of mathletes consists of 5 students at least one of which
     * is a freshman or sophomore. 
     * This method accepts no parameters from the "GUI".
     * It selects a random team of 5 mathletes containing at least 
     * one sophomore or freshman if possible. Return a String
     * that displays the team or a String stating why it is not possible.
     * (not enough mathletes, or no frosh/sophs available)
     */
    public String chooseTeam()
    {

        return "At 5'5\" with a 4.61 GPA and 133 IQ ...";
    }
    
    //returns a String which contains the current roster of Mathletes
    public String toString()
    {
        String teamString = "";
        for (int x = 0; x < team.size(); x++)
        {
            teamString += (team.get(x)).toString() + "\n";
        }
        return "\n\n" + teamString;
    }
}
