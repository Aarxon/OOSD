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

        Office[] MainBranchOff = new Office[2];
        Office[] SalesOff = new Office[2];
        Office[] TechOff = new Office[2];

    
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

                    System.out.println("Enter the employees Address:");
                    System.out.println("City: ");
                    city = input.next();
    
                    System.out.println("Street: ");
                    street = input.next();
                    
    
                    System.out.println("County: ");
                    county = input.next();
                    input.nextLine();


                    System.out.println("Select office (0=MainBranch, 1=Sales,22=Tech): ");
                    int officeChoice = input.nextInt();
                    if(officeChoice == 0)
                    {
                        if(MainBranchOff[0] == null)
                        {
                            MainBranchOff[0] = offices[officeChoice];
                        }
                        else if(MainBranchOff[1] == null)
                        {
                            MainBranchOff[1] = offices[officeChoice];
                        }
                        else
                        {
                            System.out.println("Main Branch office is full!");
                            break;
                        }
                        if(officeChoice == 1)
                        {
                            if(SalesOff[0] == null)
                            {
                                SalesOff[0] = offices[officeChoice];
                            }
                            else if(SalesOff[1] == null)
                            {
                                SalesOff[1] = offices[officeChoice];
                            }
                            else
                            {
                                System.out.println("Sales office is full!");
                                break;
                            }
                        if(officeChoice == 2)
                        {
                             if(TechOff[0] == null)
                            {
                                TechOff[0] = offices[officeChoice];
                            }
                            else if(SalesOff[1] == null)
                            {
                                TechOff[1] = offices[officeChoice];
                            }
                            else
                            {
                                System.out.println("Sales office is full!");
                                break;
                            }
                        }
                        
                        }
                    }
                   

                    // Create and store employee
                    office = offices[officeChoice];
                    address = new Address(city, street, county);
                    employees[employeeCount] = new Employee(name, address, office);
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
                        if(employees[i] == null)
                        {
                            System.out.println((i +1 ) + "." +" Empty Employee Slot");
                        }
                        else{
                        System.out.println(employees[i]);
                        System.out.println();
                        }
                    }
                    break;
        
                // Exit program
                case 4:
                    menu = true;
                    break;

            }
        }
    input.close();
    }

}