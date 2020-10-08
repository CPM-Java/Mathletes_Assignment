Constructor
Roster
public Roster(ArrayList<String> names, String[] classes)
Instantiates Mathlete objects and stores them in the
instance ArrayList

public String addMathlete(String name, String gradClass)
Receives the name and graduating class from the "GUI". 
Checks the instance array of Mathlete objects to see if the name is already stored. 
If not, then it creates a new object of type Mathlete using the input parameters 
and stores that object in the instance ArrayList of Mathletes. 
Returns a String to the "GUI" which displays the current roster of Mathletes. 
the contains method will not work for this purpose

public String addPoints(String name,int points)
Receives the name and points as parameters from the "GUI". 
Checks the instance array of Mathlete objects to see if the name is stored. 
If it is, then it adds the points to the appropriate object of type Mathlete 
and returns an updated String to the "GUI" which displays the current roster of Mathletes, 
otherwise it returns a String warning the user that the name is invalid.

public String chooseTeam()
A team of mathletes consists of 5 students at least one of which is a freshman or sophomore. 
This method accepts no parameters from the "GUI". 
It selects a (random EC) team of 5 mathletes containing at least one sophomore or freshman if possible. 
Return a String that displays the team or a String stating why it is not possible. 
  (not enough mathletes, or no frosh/sophs available)

public String removeMathlete(String name)
Receives the name from the "GUI". 
Checks the instance array of Mathlete objects to see if the name is stored. 
If it is, then it removes the object of type Mathlete and returns a String to the "GUI" 
which displays the current roster of Mathletes, 
otherwise it returns a String warning the user that the name is invalid.

public String toString()
returns a String which contains the current roster of Mathletes
