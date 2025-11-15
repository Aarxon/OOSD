package lab7;

// base class for animals
public class Animal 
{
    private String name;
    private int age;

    // create animal with name and age
    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // message when animal is vaccinated
    public String vaccinatedMessage() 
    {
    return "Animal has been vaccinated: " + toString();
    }

    @Override
    public String toString()
    {
        return "\n" + "Details: " + "\n" + "Name: " + name + "\n" + "Age: " + age;
    }
    
}
