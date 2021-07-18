package GAMING;

import java.util.Scanner;

public class Person
{
    private String name;
    private int age;
    private char gender;
    
    public Person (String newName, int newAge, char newGender)
    {
        name = newName;
        age = newAge;
        gender = newGender;
    }
    
    public void setName (String newName)
    {
        name = newName;
    }
            
     public void setAge (String newAge)
    {
        name = newAge;
    }
                   
    public void setGender (String newGender)
    {
        name = newGender;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public char getGender()
    {
        return gender;
    }
}
