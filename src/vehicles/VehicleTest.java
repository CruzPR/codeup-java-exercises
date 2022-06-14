package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Gran Torino");
        System.out.print(car.getName() + " goes");
        car.makeNoise();

    Truck truck = new Truck();
    truck.setName("Truck");
        System.out.println(truck.getName() + " sounds like ");
        truck.makeNoise();



    }




}
