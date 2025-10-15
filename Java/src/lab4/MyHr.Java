package lab4;
import java.util.Scanner;

public class MyHr
{
    public static void main(String[] args)
    {
        //Scanner Ojbect
        Scanner input = new Scanner(System.in);
        
  
        Office off1 = new Office(100);
        Address addr1 = new Address("Athy", "Seaview", "Kildare");
        Employee John = new Employee("John", addr1, off1);

        //Variables
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
    
                case 2:
                    System.out.println("Enter the employees name");
                    System.out.println("Enter the employees Address");
                    System.out.print("City: ");
                    System.out.println("Street: ");
                    System.out.println("County: ");
        
                case 3:
        
                case 4:
                    menu = true;
                    break;

            }
            

            
            
            
        }
    }
}