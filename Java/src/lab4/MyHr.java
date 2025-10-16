package lab4;
import java.util.Scanner;

public class MyHr
{
    public static void main(String[] args)
    {
        //Scanner Ojbect
        Scanner input = new Scanner(System.in);
        
  
        Employee[] employees = new Employee[4];
        Office[] offices = new Office[2];
        Address addr1 = new Address("Athy", "Seaview", "Kildare");
    

        //Variables
        String name;
        Address address;
        Office office;
        int menuChoice;
        boolean menu;
        String info;
        
        menu = false;

        while(!menu)
        {
            System.out.println("1. List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");
            menuChoice = input.nextInt();
            switch(menuChoice) 
            {
                case 1:
                    for(Office Office : offices)
                    {
                    System.out.println(offices);
                    }
    
                case 2:
                    System.out.println("Enter the employees name");
                    System.out.println("Enter the employees Address");
                    System.out.print("City: ");
                    System.out.println("Street: ");
                    System.out.println("County: ");
        
                case 3:
                    for(Employee Employee : employees)
                    {
                        System.out.println(employees);
                    }
        
                case 4:
                    menu = true;
                    break;

            }
            

            
            
            
        }
    }
}