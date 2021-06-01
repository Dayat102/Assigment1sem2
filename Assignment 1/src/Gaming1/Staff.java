package Gaming1;

import java.util.Scanner;

public class Staff {
	
	private String name[],position[];
	private int age[];
	private char gender[];
	private int counter;
	private double salary[],profit,company_income,total=0;
	Scanner sc=new Scanner(System.in);
	
	
	public Staff(int size) {
		name =new String [size];
		age = new int [size];
		gender = new char [size];
		position =new String [size];
		salary = new double[size];
	}
	
	public void addlist(int size) {
		for(int i=0; i<size ;i++) {	
			System.out.print("\nEnter your name: ");
			this.name[i] = sc.next();
			System.out.print("Enter your age: ");
			this.age [i]= sc.nextInt();
			System.out.print("What is your gender (M/F): ");
			this.gender[i] = sc.next().toCharArray()[0];
			System.out.print("Enter your position in this company: ");
			this.position[i] = sc.next();
			System.out.print("Enter your salary: ");
			this.salary [i]= sc.nextDouble();
			this.total=this.total+this.salary[i];
		}
	}
	
	public void display(int size) {
		System.out.print("Staff List :- ");
		for(int i=0; i<size ;i++) {	
			System.out.println("\nName: "+this.name[i]);
			System.out.println("Age: "+this.age [i]);
			System.out.println("Gender: "+this.gender[i]);
			System.out.println("Position: "+this.position[i]);
			System.out.println("Salary: "+this.salary[i]);
			System.out.println();
		}
	}
	
	public void finance(int player, double budget,double income) {
		
		this.company_income=income;
		if(player== 0) {
			this.profit=income+-budget-this.total;
			System.out.println("Income for This Company (Sponsorship): "+this.company_income);
			System.out.println("Total Staff Salary: "+this.total);
			System.out.println("Profit without any competition: "+this.profit);
		}
		else {
			this.profit=(income+(player*200))-budget-this.total;
			System.out.println("Income for This Company (Sponsorship): "+this.company_income);
			System.out.println("Total From Competition: "+(player*200));
			System.out.println("Total Staff Salary: "+this.total);
			System.out.println("Profit: "+this.profit);
		}
	}
	
}
