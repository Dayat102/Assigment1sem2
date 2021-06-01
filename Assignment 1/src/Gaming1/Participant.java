package Gaming1;

import java.util.Scanner;

public class Participant {
	
	private String name[];
	private int age[];
	private char gender[];
	private int counter;
	Scanner sc=new Scanner(System.in);
	
	public Participant(int size) {
		
		name =new String [size];
		age = new int [size];
		gender = new char [size];
	}
	
	public void register(int size) {
		for(int i=0; i<size ;i++) {	
			System.out.print("\nEnter your name: ");
			this.name[i] = sc.next();
			System.out.print("Enter your age: ");
			this.age [i]= sc.nextInt();
			System.out.print("What is your gender (M/F): ");
			this.gender[i] = sc.next().toCharArray()[0];
		}
	}
	
	public void display(int size) {
		System.out.print("Participant List :- ");
		for(int i=0; i<size ;i++) {	
			System.out.println("\nName: "+this.name[i]);
			System.out.println("Age: "+this.age [i]);
			System.out.println("Gender: "+this.gender[i]);
		}
	}
	
	public void searchRecord(String a)
    {
        int i = 0;
        while (this.name [i] != null && !this.name[i].equals(a))
        {
            i++;
        }
        if (this.name [i] == null) {
            System.out.println(a + " was not join this competition.");
        	System.out.println();
        }
        else {
            System.out.println(a + " at a position " + i);
        	System.out.println();
        }
    }
	
}
