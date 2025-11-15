package lab7;

// test driver for vet and animals
public class AnimalDriver 
{
    public static void main(String[] args)
    {
        // create animals and vet
        Animal Dog = new Dog("Lexi",4);
        Animal Cat = new Cat("Misty",3);
        Vet Aaron = new Vet("Aaron");

        Aaron.Vaccinate(Dog);
        Aaron.Vaccinate(Cat);
        
    }
    
}
