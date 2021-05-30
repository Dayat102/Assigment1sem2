package gaming;

import java.util.Scanner;
public class GamingList {

	private Gaming [] gaming;
    private int counter,employee,a=0,date;
    private double salary,advertisement,totalbudget=0,rent,profit=0,total_rent,n=0,totalyuran=0,baki,baki1;
    private String place,place1;
    Scanner sc=new Scanner(System.in);
    
        public GamingList(int size)
        {
            gaming = new Gaming [size];
            counter = 0;
        }
        
        public void addRecord(String name, int teammate)
        {
            gaming [counter] = new Gaming (name, teammate);
            counter++;
        }
        
        public void searchRecord(String name)
        {
            int i = 0;
            while (gaming [i] != null && !gaming[i].getName().equals(name))
            {
                i++;
            }
            if (gaming [i] == null) {
                System.out.println(name + " was not join this competition.");
            	System.out.println();
            }
            else {
                System.out.println(name + " at a position " + i);
            	System.out.println();
            }
        }
        
        public void registration() {
        	
        	int [] yuran = new int [counter];
        	System.out.println("Please pay the entry fee before entering the competition space !!");
        	System.out.println("The participation fee is 200 per team");
        	System.out.println();
        	for (int i = 0; i < counter; i++)
            {
                System.out.println("Team Name = " + gaming[i].getName());
                System.out.print("Fees: Rm");
                yuran[i]=sc.nextInt();
                System.out.println();
                totalyuran=totalyuran+yuran[i];
            }
        	
        	do {
        		for (int i = 0; i < counter; i++)
        		{
        			if(yuran[i]<200) {
        				System.out.println("Team Name = " + gaming[i].getName());
        				System.out.println("Your team just paid Rm " + yuran[i]);
        				System.out.println("Please pay the balance to enter the competition !! ");
        				baki=200-yuran[i];
        				System.out.println("Balance that you need to pay:Rm "+ baki);
        				System.out.println("Please enter the amount you wish to pay:Rm ");
        				baki1=sc.nextInt();
        				totalyuran=totalyuran+baki1;
        			}
        		}
        		break;
        	}
        	while(totalyuran==(counter*200));
        	this.profit=totalyuran;
        }
        
        public void place() {
    		System.out.println("Please enter a contest venue :");
    		this.place = sc.next();
    		System.out.println("We got a special offer from the landlord,if we rent more than 2 days we will got special discount!!!! ");
    		System.out.println("how many days this competition will be held? ");
    		this.date = sc.nextInt();
    		System.out.println("Please enter cost for rent per day: ");
    		this.rent=sc.nextDouble();
    		System.out.println();
    		if (this.date>2) {
    			this.total_rent=(this.rent*this.date)*0.7;
    		}
    		else
    			this.total_rent=this.rent*this.date;	
    	}
    	
    	public void employee() {
    		System.out.println("Please enter number of Employee ?");
    		this.employee=sc.nextInt();
    		String name1[]= new String[this.employee];
    		int age1[] = new int [this.employee];
    		String position[]= new String[this.employee];
    		int salary[] = new int [this.employee];
    		for (int i=0; i<this.employee ; i++) {
    			System.out.println("Please enter employee name ?");
    			name1[i]=sc.next();
    			System.out.println("Please enter age ?");
    			age1[i]=sc.nextInt();
    			System.out.println("Please enter your position in the company ?");
    			position[i]=sc.next();
    			System.out.println("Please enter your Salary ?");
    			salary[i]=sc.nextInt();
    			this.a=this.a+salary[i];
    		}
    		this.totalbudget=this.totalbudget+this.salary;
    		this.profit=this.profit-this.a;
    		System.out.println("List of employee:");
    		for (int i=0; i<this.employee ; i++) {
                System.out.println(i+1 +") Name = " + name1[i]);
                System.out.println("   Age= " + age1[i]);
                System.out.println("   Position= " + position[i]);
                System.out.println("   Salary= " + salary[i]);
    		}
    	}
    	
    	public void advertisement() {
    		System.out.println("We got special offer for early bird:-");
    		System.out.println("For the first 5 teams, you will get 10% off the payment fee");
    		System.out.println("Please enter total value for advertisement");
    		this.advertisement=sc.nextDouble();
    		System.out.println("Please list down the place that we will put our advertisement:-" + "(please enter the place like this, EXP: tv,newspaper)");
    		this.place1=sc.next();
    		this.totalbudget=this.totalbudget+this.advertisement;
    		this.profit=this.profit-this.advertisement;
    	}
    	
    	public void finance() {
    		this.totalbudget = totalbudget + this.total_rent;
    		this.profit=this.profit-this.total_rent;
    	}
    	
    	public void displayRecord()
        {
    		System.out.println();
    		System.out.println("*************OVERVIEW*************");
            System.out.println("Venue:" + this.place);
            System.out.println("Held:" + this.date + " days");
            System.out.println("List team that join this tournament:");
    		for (int i = 0; i < counter; i++)
            {
                System.out.println(i+1 +") Name = " + gaming[i].getName());
                System.out.println("   Number of crew = " + gaming[i].getTeammate());
            }
    		System.out.println("Ad Place: " + this.place1);
            System.out.println("Total Employe:" + this.employee);
            System.out.println("Total Workers' wages:" + this.a);
            System.out.println("Gross profit:" + totalyuran);
            System.out.println("Total Budget:" + this.totalbudget);
            System.out.println("Profit:" + this.profit);
        }
    	
}