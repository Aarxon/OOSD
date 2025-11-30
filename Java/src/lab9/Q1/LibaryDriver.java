package lab9.Q1;

public class LibaryDriver 
{
    public static void main(String[] args) 
    {
        Book book1 = new Book("Book", "B001", "F. Scott Fitzgerald", "The Great Gatsby", 180);
        CD cd1 = new CD("CD", "C001", "The Beatles", "Abbey Road", 17);

        book1.calculatePrice();
        cd1.calculatePrice();
    }
    
}