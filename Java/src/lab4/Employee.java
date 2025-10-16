package lab4;

public class Employee 
{
    // Instance variables
    private String name;
    private String employeeType = "";
    private Address address;
    private Office office;

    // Static counter for total employees
    private static int employeeNum = 100;

    // Constructor - creates employee with address and office assignment
    public Employee(String name, int employeeNum, Address address, Office office) {
        this.name = name;
        this.address = address;
        this.office = office;
        employeeNum++;
    }


    // String representation
    @Override
    public String toString()
    {
        return "Employee Name: " + name + "\n" + employeeNum + "\n" + address + "\n" + office;
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
        return employeeNum;
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
