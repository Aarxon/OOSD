package lab2.lab2aq3;

public class HotelRoom
{

    //Private variables
    private int roomNumber;
    private String roomType;
    private int occupied;
    private double rate;


    //Empty Constructor
    public HotelRoom()
    {

    }

    //Constructor with parameters
    public HotelRoom(int roomNumber, String roomType, int occupied, double rate)
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
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

    public void setroomRate(double rate)
    {
        this.rate = rate;
    }

    public void setRoomOccupied(int occupied)
    {
        this.occupied = occupied;

    }

    //Getters
    public int getOccupied()
    {
       return occupied;
    }
    public int getroomNumber()
    {
        return roomNumber;
    }

    public String getRoomType()
    {
        return roomType;
    }

    public double getRate()
    {
        return rate;
    }
}