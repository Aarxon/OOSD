package lab9.Q1;

public class CD extends LibaryItem 
{
    String band;
    String title;
    int numTracks;
    public CD(String type, String ID, String band, String title, int numTracks)
    {
        super(type, ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    public void calculatePrice()
    {
        double price = 1.0 + (0.5 * numTracks);
        System.out.println("The price of the CD \"" + title + "\" is: $" + price);
    }
    
}
