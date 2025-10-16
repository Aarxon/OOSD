package lab4;
import java.util.Scanner;

public class MyHr
{
    public static void main(String[] args)
    {
        // Scanner object
        Scanner input = new Scanner(System.in);
        
        // Create office objects
        Office MainBranch = new Office();
        Office Sales = new Office();
        Office Tech = new Office();

        // Initialize arrays
        Employee[] employees = new Employee[5];
        Office[] offices = new Office[3];
        offices[0] = MainBranch;
        offices[1] = Sales;
        offices[2] = Tech;

    
        // Variables
        String name;
        String city;
        String street;
        String county;
        int employeeCount;
        Address address;
        Office office;
        int menuChoice;
        boolean menu;
        String info;


        employeeCount = 0;
        menu = false;

        // Main menu loop
        while(!menu)
        {
            System.out.println("1. List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");
            menuChoice = input.nextInt();
            switch(menuChoice) 
            {
                // Display all offices
                case 1:
                    for(int i = 0; i < offices.length; i++)
                    {
                    System.out.println(offices[i]);
                    }
                    break;

                // Create new employee
                case 2:
                if(employeeCount < 5)
                {
                    // Get employee details
                    System.out.println("Enter the employees name");
                    name = input.next(); 
                    System.out.println("Enter the employees Address");
                    System.out.println("City: ");
                    city = input.next();
    
                    System.out.println("Street: ");
                    street = input.next();
                    input.next();
    
                    System.out.print("County: ");
                    county = input.next();

                    System.out.println("Select office (0=MainBranch, 1=Sales, 2=Tech): ");
                    int officeChoice = input.nextInt();

                    // Create and store employee
                    office = offices[officeChoice];
                    address = new Address(city, street, county);
                    employees[employeeCount] = new Employee(name, Employee.getEmployeeNum(), address, office);
                    employeeCount++;
                }
                else
                {
                    System.out.println("You have reached the maximum number of employees!");
                }
                    break;
                    
        
                // Display all employees
                case 3:
                    for(int i = 0; i < employees.length; i++)
                    {
                        System.out.println(employees[i]);
                    }
                    break;
        
                // Exit program
                case 4:
                    menu = true;
                    break;

            }
            

            
            
            
        }
    }
}