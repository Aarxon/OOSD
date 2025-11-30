package lab9.Q1;

public class Book extends LibaryItem
{
    String author;
    String title;
    int numPages;

    public Book(String type, String ID, String author, String title, int numPages)
    {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    public void calculatePrice()
    {
        double price = 0.5 + (0.1 * numPages);
        System.out.println("The price of the book \"" + title + "\" is: $" + price);
    }
    
}
