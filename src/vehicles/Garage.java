package vehicles;

public class Garage {

    private String name;
    private Vehicle[] vehicles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;

    //constructor
//    public Garage(){}
//
//    public Garage(String name) {
//        this.name = name;
//        }

//    public Vehicle findVehicle(String name, Vehicle[] vehicles){
//        for (Vehicle vehicle: vehicle) {
//            if (vehicle.getName().equalsIgnoreCase(name)){
//                return vehicle;
//            }
//        }
//        return new Vehicle(null);
        }

    public void retrieveVehicles() {
        for(Vehicle vehicle: vehicles) {
            vehicle.makeNoise();
        }
        }

    }

