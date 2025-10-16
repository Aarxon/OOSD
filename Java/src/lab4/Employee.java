package lab4;

public class Employee 
{
    private String name;
    private String employeeTypev = "";
    private Address address;
    private Office office;
    private int employeeCount;

    private static int employeeNum = 100;


    public Employee(String name, Address address, Office office) {
        this.name = name;
        this.address = address;
        this.office = office;
        employeeNum++;
    }

    //Other Methods
    public void createEmployee(int employeeCount)
    {
        employeeCount ++;
    }

    @Override
    public String toString()
    {
        return "Employee Name: " + name + "Employee Address" + address + "Employee Office " + office;
    }

    //Getters
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Office getOffice() {
        return office;
    }

    //Setters
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
