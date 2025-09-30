package lab2.lab2aq2;

public class HotelRoomMain {

    public static void main(String[] args) 
    {

        //Obects
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();


    
        //Setting the objects with information
        roomA.setroomNumber(200);
        roomA.setroomType("Single");
        roomA.setroomRate(100);
        roomA.setRoomOccupied(1);

        roomB.setroomNumber(201);
        roomB.setroomType("Double");
        roomB.setroomRate(80);
        roomB.setRoomOccupied(0);

        //Prints
        System.out.println("Room A Number: " + roomA.getroomNumber());
        System.out.println("Room A Type: " + roomA.getRoomType());
        System.out.println("Room A Rate: " + roomA.getRate());
        System.out.println("Room A Status: " + roomA.getOccupied());

        //To break both statements
        System.out.println(" ");

        System.out.println("Room B Number: " + roomB.getroomNumber());
        System.out.println("Room B Type: " + roomB.getRoomType());
        System.out.println("Room B Rate: " + roomB.getRate());
        System.out.println("Room B Status: " + roomB.getOccupied());

    }
}
