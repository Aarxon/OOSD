package lab8.Q2;

public class Employee extends Person
{
    int annualSalary;
    public Employee(String name, int annualSalary)
    {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public String getDescription()
    {
        return "An employee with a salary of " + annualSalary + ".";
    }
}
