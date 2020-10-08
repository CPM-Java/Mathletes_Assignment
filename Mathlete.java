
/**
 * ArrayList Assignment.
 * 
 * DO NOT MODIFY THIS CLASS
 * 
 * @author GrayKnight
 * @version 11/26/12 mods 1/18/18
 */
public class Mathlete
{
    private final int MAXNAME = 10; //max name length
    private String myGradClass;
    private String myName;
    private int myPoints = 0; //total points scored

    /**
     * Constructor for objects of class TeamMember
     */
    public Mathlete(String name, String gradClass)
    {
        // initialize instance variables
        myName = name;
        myGradClass = gradClass;
    }
    
    public Mathlete(String name, String gradClass, int points)
    {
        this(name, gradClass);
        myPoints = points;   
    }
    
    /**
      Getter Methods
     */
    public String getName()
    {
        return myName;
    }
    public String getGradClass()
    {
        return myGradClass;
    }
    public int getPoints()
    {
        return myPoints;
    }
    
    public void setPoints(int p)
    {
        myPoints = p;
    }
    
    public void lookMean()
    {
        System.out.println("Grrrrrrrrr!!!!!");
    }
    
    public String toString()
    {
        return resize(myName) + resize("  Class:" + myGradClass) + "  Points Scored:" + myPoints;
    }
    
        //Don't freak-out about this helper method.
    //It makes the strings all the same length for display
    //  so the names look nice and the "rows" stay straight.
    private String resize(String p){
        while(p.length() < MAXNAME) {
                p = p + " ";
        }        
        return p; 
    }
}
