
/**
 * Updates the console display
 * 
 * DO NOT MODIFY THIS CLASS
 * 
 * @author GK
 * @version 11/29/14
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.net.URL;
import java.io.*;

public class ConsoleIO
{
    private Scanner nameScan = new Scanner(System.in);
    private Scanner numScan = new Scanner(System.in);
    private Random rand = new Random();
    private Roster gk;
    private String[] classArray = {"Sr","Jr","So","Fr"};
    private final String nameFile = "MostPopularNames1999.txt";
    private ArrayList<String> allNames = new ArrayList<String>();

    public ConsoleIO()
    {
        //create initial roster
        this.fillNameList();
        ArrayList<String> randNames = new ArrayList<String>();
        //5 - 15 names on initial roster    
        for (int x = 0; x < 5 + rand.nextInt(11); x++)
        {   //fill an array with unique, randomly chosen, names
            randNames.add(allNames.remove(rand.nextInt(allNames.size())));
        }
        
        
        gk = new Roster(randNames, classArray);
        
        //display initial roster
        System.out.println(gk);
        
        int sentinel  = 0, points = 0, year = 0;
        String name = "";
        while (sentinel!=5)
        {
            System.out.println("1_add, 2_remove, 3_Add Points, 4_Choose Team, 5_Quit"); 
            sentinel = numScan.nextInt(); 
            
            if(sentinel == 1)
            {
                System.out.print("Name:");
                name = nameScan.nextLine();
                System.out.print("Class: 1. Senior, 2. Junior, 3. Sophomore, 4. Freshman\nChoose number: ");
                year = numScan.nextInt();
                if(year > 4 || year < 1) year = rand.nextInt(4) + 1;
                String gClass = classArray[year-1];
                System.out.println(gk.addMathlete(name, gClass));
            }
            else if(sentinel == 2)
            {
                System.out.print("Name:");
                name = nameScan.nextLine();
                System.out.println(gk.removeMathlete(name));
            }
            else if(sentinel == 3)
            {
                System.out.print("Name:");
                name = nameScan.nextLine();
                System.out.print("Points:");
                points = numScan.nextInt();
                System.out.println(gk.addPoints(name, points));
            }            
            else if(sentinel == 4) System.out.println(gk.chooseTeam());
        }
        
    }
    
        private void fillNameList(){
        String s;
        try{
            //will locate the data file from anywhere in the path
            URL url = getClass().getClassLoader().getResource(nameFile);
            if (url == null) throw new IOException("file not found");
         
            //convert an (byte)InputStream into a character input stream
            BufferedReader file = new BufferedReader(new InputStreamReader(url.openStream()));
            
            while ((s = file.readLine()) != null)
               {
                  allNames.add(s);
               }
        file.close();
        }catch (IOException e){
            System.out.println("MostPopularNames1999.txt file not opened\n" + e.toString());
        }
        
    }
    
}
