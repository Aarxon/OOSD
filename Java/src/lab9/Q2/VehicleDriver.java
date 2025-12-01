package lab9.Q2;

public class VehicleDriver 
{
    public static void main(String[] args) 
    {
    RoadVehicle car = new Car("Sedan", 4, 5);
    RoadVehicle hgv = new Hgv(2000, 6, 2);

    car.calculateDuty();
    hgv.calculateDuty();
    }

    
    
}
