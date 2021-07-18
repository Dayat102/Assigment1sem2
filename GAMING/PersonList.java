package GAMING;
public class PersonList
{

    private Person [] person;
    private int counter;
    
        public PersonList(int size)
        {
            person = new Person [size];
            counter = 0;
        }
        
        public void addRecord(String name, int age, char gender)
        {
            person [counter] = new Person (name, age, gender);
            counter++;
        }
    
        public void searchRecord(String name)
        {
            int i = 0;
            
            while (person [i] != null && !person [i].getName().equals(name))
            {
                i++;
            }
            
            if (person [i] == null)
                System.out.println(name + " was not in the array.");
            else
                System.out.println(name + " at a position " + i);
        }
    
        public void deleteRecord(String name)
        {
            int delName = 0;
            person [delName] = null;
            
            while (person [delName] != null && !person [delName].getName().equals(name))
            {
                delName++;
            }
            
            if (person [delName] == null)
                person [delName].getName().equals(name);
                
        }
    
        public void displayRecord()
        {
            for (int i = 0; i < counter; i++)
            {
                System.out.println("\nName = " + person[i].getName());
                System.out.println("Age = " + person[i].getAge());
                System.out.println("Gender = " + person[i].getGender());
            }
        }
}