package lab7;

// cat class extends animal
public class Cat extends Animal
{
    public Cat(String name, int age)
    {
        super(name, age);
    }

    @Override
    public String vaccinatedMessage() 
    {
        return "Cat has been vaccinated" + super.toString(); 
    }
}
