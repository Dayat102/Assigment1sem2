package GAMING;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Company a= new Company();
		a.setAdress();
		a.setEmail();
		a.setName();
		a.setPhone();
		
		int menu,staffnum,age,menu1;
		char gender;
		String name=null;
		Advertisement d = new Advertisement();
		GamingDescription e = new GamingDescription();
		System.out.println("Welcome to " + a.getName());
		
		 do
	        {                        
	            System.out.println();
	            System.out.println(":::::::::::: Menu ::::::::::::");
	            System.out.println("1. Staff .");
	            System.out.println("2. Registration.");
	            System.out.println("3. Advertisement.");
	            System.out.println("4. Gaming Description.");
	            System.out.println("0. Exit");
	                  
	            System.out.print("\nEnter your choice (1 - 4) or 0 to Exit: ");
	            menu = sc.nextInt();
	               
	            if (menu == 1)
	            {
	            	do {
		            	System.out.println(":::::::::::: Menu ::::::::::::");
			            System.out.println("1. Register Staff.");
			            System.out.println("2. Finance,");
			            System.out.println("0. Main Menu");
			            
			            System.out.print("\nEnter your choice (1 - 2) or 0 to Back: ");
			            menu1 = sc.nextInt();
		                
			            if(menu1==0) {
		                	break;
		                }
			            
		                if(menu1==1) {
			            	System.out.print("Enter number of your Staff: ");
			            	staffnum=sc.nextInt();
			            	Staff c= new Staff(staffnum);
			            	c.addlist(staffnum);
			            	c.display(staffnum);
		                }
		                
		                else if(menu1==2) {
		                	Finance r= new Finance(500, 3000, 160, 100, 800, 1000, 5000);
		                	r.FinancialSatement();
		                }
	            	}while (menu1 != 0);
	            	
	            }
	            
	            else if (menu == 2)
	            {
	            	
	            	System.out.print("Enter number of participant: ");
	                int num = sc.nextInt();
	                PersonList people = new PersonList(num);
	                
	            	do {
		            	System.out.println(":::::::::::: Menu ::::::::::::");
			            System.out.println("1. Register Name.");
			            System.out.println("2. Search Participant,");
			            System.out.println("3. Delete Name.");
			            System.out.println("4. Display Participant.");
			            System.out.println("0. Main Menu");
			            
			            System.out.print("\nEnter your choice (1 - 4) or 0 to Back: ");
			            menu1 = sc.nextInt();
		                
			            if(menu1==0) {
		                	break;
		                }
			            
		                if(menu1==1) {
		                	for (int i = 0; i < num; i++)
		                	{
		                		System.out.print("\nEnter name = ");
		                		name = sc.next();
		                		System.out.print("\nEnter age = ");
		                		age = sc.nextInt();
		                		System.out.print("\nEnter gender = ");
		                		gender = sc.next().toCharArray()[0];
		                		people.addRecord(name, age, gender);
		                	}
		                }
		                
		                else if(menu1==2) {
			                System.out.print("\nEnter the name you want to search: ");
			                name = sc.next();
			                people.searchRecord(name);
		                }
		                
		                else if(menu1==2) {
			                System.out.print("\nEnter the name you want to delete: ");
			                name = sc.next();
			                people.deleteRecord(name);
		                }
		                
		                else if(menu1==4) {
		                	people.displayRecord();
		                }
		                
			            else if (menu1 < 0  || menu1 >= 5)
			                System.out.println("Invalid! Please try again!");
		            }
		            while (menu1 != 0);
	            }
	       
	            
	            else if (menu == 3)
	            {
	            	d.advertisement();
	            }
	            
	            else if (menu == 4)
	            {
	            	e.gamingDescription(200,"2 JANUARY 2021");
	            }
	            

	            else if (menu < 0  || menu >= 5)
	                System.out.println("Invalid! Please try again!");
	        }//end while
	        while (menu != 0);//to stop the program
	            System.out.println("\n If you have any problem, you can contact us :-");
	            System.out.println("Company Number : " + a.getPhone());
	            System.out.println();
	            System.out.println("Or you can come to our company");
	            System.out.println("Address: \n" + a.getAdress());
	            System.out.println("\n--- PROGRAM END. THANK YOU FOR USING THIS APPLICATION ---");
		
	}
}