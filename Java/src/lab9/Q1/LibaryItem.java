package lab9.Q1;

public abstract class LibaryItem implements LoanItem
{
    String type;
    String ID;

    public LibaryItem(String type, String ID)
    {
        this.type = type;
        this.ID = ID;
    }

}