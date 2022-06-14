package vehicles;

public class Truck extends Vehicle{
@Override
    public void makeNoise() {
        System.out.println(" VROOOOOOM!");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("COOOOOOOOOSSSSH");
    }
}
