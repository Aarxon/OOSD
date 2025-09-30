package lab2aq1;

public class HotelRoom
{

    //Private variables
    private int roomNumber;
    private String roomType;

    //Empty Constructor
    public HotelRoom()
    {

    }

    //Setters
    public void setroomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void setroomType(String roomType)
    {
        this.roomType = roomType;
    }

    //Getters
    public int getroomNumber()
    {
        return roomNumber;
    }

    public String getRoomType()
    {
        return roomType;
    }
}