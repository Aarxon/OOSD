package lab2aq1;

public class HotelRoomMain {

    public static void main(String[] args) 
    {

        //Obects
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();


    
        //
        roomA.setroomNumber(200);
        roomA.setroomType("Single");

        roomB.setroomNumber(201);
        roomB.setroomType("Double");

        System.out.println("Room A Number: " + roomA.getroomNumber());
        System.out.println("Room A Type: " + roomA.getRoomType());

        System.out.println("Room B Number: " + roomB.getroomNumber());
        System.out.println("Room B Type: " + roomB.getRoomType());

    }
}
