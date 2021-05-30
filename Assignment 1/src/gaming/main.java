package gaming;

import java.util.Scanner;

public class main {
	public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String name = null,c_name;
        int teammate = 0;
        System.out.println("WELCOME TO MAGIC CHESS TOURNAMENT");
        System.out.println("*********************************");
        
        System.out.print("Enter number of team that join this tournament: ");
        int num = sc.nextInt();
        GamingList a = new GamingList(num);
        
        for (int i = 0; i < num; i++)
        {
            System.out.print("Enter Team name = ");
            name = sc.next();
            System.out.print("Enter Number of teammate = ");
            teammate = sc.nextInt();
            System.out.println();
            
            a.addRecord(name, teammate);
        }
        
        System.out.print("\nEnter the team name you want to search: ");
        name = sc.next();
                
        a.searchRecord(name);
        a.registration();
        a.place();
        a.finance();
        a.advertisement();
        a.employee();
        a.displayRecord();
             
    }
}

