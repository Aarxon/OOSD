package lab7;

// dog class extends animal
public class Dog extends Animal 
{
    public Dog(String name, int age)
    {
        super(name, age);
    }
    

    @Override
    public String vaccinatedMessage() 
    {
        return "Dog has been vaccinated" + super.toString();
    }
}
