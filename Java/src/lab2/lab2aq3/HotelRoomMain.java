package lab2.lab2aq3;

public class HotelRoomMain {

    public static void main(String[] args) 
    {

        //Obects
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();
        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);


    
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
        
        //Room A
        System.out.println("Room A Number: " + roomA.getroomNumber());
        System.out.println("Room A Type: " + roomA.getRoomType());
        System.out.println("Room A Rate: " + roomA.getRate());
        System.out.println("Room A Status: " + roomA.getOccupied());

        //To break both statements
        System.out.println(" ");

        //Room B
        System.out.println("Room B Number: " + roomB.getroomNumber());
        System.out.println("Room B Type: " + roomB.getRoomType());
        System.out.println("Room B Rate: " + roomB.getRate());
        System.out.println("Room B Status: " + roomB.getOccupied());

        System.out.println(" ");

        //Room C
        System.out.println("Room C Number: " + roomC.getroomNumber());
        System.out.println("Room C Type: " + roomC.getRoomType());
        System.out.println("Room C Rate: " + roomC.getRate());
        System.out.println("Room C Status: " + roomC.getOccupied());

    }
}
