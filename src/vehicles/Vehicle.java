package vehicles;



public class Vehicle {
    private String name;

    public void makeNoise(){
        System.out.println("Beep, beep!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(){}

    public Vehicle(String name) {
        this.name = name;
    }



}
