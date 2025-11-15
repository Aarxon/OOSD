package lab7;

// vet can vaccinate animals
public class Vet 
{
    private String name;

    public Vet(String name)
    {
        this.name = name;
    }
    
    // vaccinate an animal
    public void Vaccinate(Animal a) 
    {
        System.out.println(name + " is vaccinating. " + "\n" + a.vaccinatedMessage() + "\n");
    }

}
  