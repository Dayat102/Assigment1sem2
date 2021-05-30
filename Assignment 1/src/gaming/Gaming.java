package gaming;

import java.util.Scanner;
public class Gaming {
	
	private String teamname;
    private int teammate;
    
    public Gaming (String newName, int newTeammate)
    {
        teamname = newName;
        teammate = newTeammate;
    }
    
    public void setName (String newName)
    {
        teamname = newName;
    }
    
     public void setTeammate(int newTeammate)
    {
        teammate = newTeammate;
    }
     
    public String getName()
    {
        return teamname;
    }
    
    public int getTeammate()
    {
        return teammate;
    }

}

