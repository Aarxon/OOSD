package lab4;



public class Employee 
{
    // Instance variables
    private String name;
    private Address address;
    private Office office;
    private String employeeType;
    private String employeeCar;
    private static int employeeCount = 0;
    private static int carCount = 0;
    private static final String[] cars = {
        "Black Volkswagen Golf", 
        "Red Ford Focus", 
        "White BMW 3 Series",
        "White Volkswagen Passat",
        "Yellow Audi A4"
    };
    


    // Static counter for total employees
    private static int employeeNumNext = 100;
    private final int employeeNum;

    // Constructor - creates employee with address and office assignment
    public Employee(String name, String employeeType, Address address, Office office) 
    {
        this.name = name;
        this.address = address;
        this.office = office;
        this.employeeNum = employeeNumNext;
        this.employeeType = employeeType;
        employeeNumNext ++;
        employeeCount++;

        // Assign car to managers only
        if(employeeType.equalsIgnoreCase("manager"))
        {
            employeeCar = cars[carCount];
            carCount++;
        }
        else
        {
            employeeCar = "N/A";
        }
    }

  

    // String representation
    @Override
    public String toString()
    {
        return "Employee Name: " + name + "\n" + "Employee Type: "  + employeeType + "\n" + "Employee car : " + employeeCar + "\n" + "Employee Number: " + employeeNum + "\n" + address + "\n" + office;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Office getOffice() {
        return office;
    }

    public static int getEmployeeNum() {
        return employeeNumNext;
    }

    public int getEmployeeCount()
    {
        return employeeCount;
    }

    // Setters


    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(Address address)
    {  
        this.address = address;
    }

    public void setOffice(Office office)
    {
        this.office = office;
    }
    
}
