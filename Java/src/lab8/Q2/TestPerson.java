package lab8.Q2;

public class TestPerson 
{
    public static void main(String[] args) 
    {
       Person[] people = new Person[2];
       people[0] = new Employee("Aaron", 1000000000);
       people[1] = new Student("Amy", "Software Development ");

        for (Person people1 : people) 
        {
            String printDesc = people1.getDescription();
            String printName = people1.getName();
            
            System.out.print(printName + ": ");
            System.out.println(printDesc);
        }
    }
    
}
