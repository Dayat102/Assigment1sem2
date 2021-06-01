package Gaming1;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Company a= new Company();
		a.setAdress();
		a.setEmail();
		a.setName();
		a.setPhone();
		
		int menu,num=0,staffnum;
		String name=null;
		char corn;
		Advertisement d = new Advertisement();
		Rules e= new Rules();
		System.out.println("Welcome to " + a.getName());
		
		 do
	        {                        
	            System.out.println();
	            System.out.println(":::::::::::: Menu ::::::::::::");
	            System.out.println("1. Staff (including finance).");
	            System.out.println("2. Registration.");
	            System.out.println("3. Advertisement.");
	            System.out.println("4. Rules.");
	            System.out.println("0. Exit");
	                  
	            System.out.print("\nEnter your choice (1 - 4) or 0 to Exit: ");
	            menu = sc.nextInt();
	               
	            if (menu == 1)
	            {
	            	System.out.print("Enter number of your Staff: ");
	            	staffnum=sc.nextInt();
	            	Staff c= new Staff(staffnum);
	            	c.addlist(staffnum);
	            	c.display(staffnum);
	            	c.finance(num, 2000,50000);
	            	
	            }
	            
	            else if (menu == 2)
	            {
	            	System.out.print("Enter number of Participant: ");
	            	num=sc.nextInt();
	        		Participant b=new Participant(num);
	            	b.register(num);
	            	System.out.println("Do you want to search your name ? Y/N " );
	            	corn=sc.next().charAt(0);
	            	if(corn=='y' || corn == 'Y') {
	            		System.out.print("\nEnter the name you want to search: ");
	            		name = sc.next();
	            		b.searchRecord(name);
	            	}
	            	b.display(num);
	            	
	            }
	            
	            else if (menu == 3)
	            {
	            	d.advertisement();
	            }
	            
	            else if (menu == 4)
	            {
	            	e.rules(200,"2 JANUARY 2021");
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
