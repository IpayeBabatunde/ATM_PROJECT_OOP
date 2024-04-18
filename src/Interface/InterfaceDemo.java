package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(300, 40, 2);

        System.out.println("Gear is: " + mountainBike.getGear());
        System.out.println("Seat height is: " + mountainBike.getSeatHeight());
        System.out.println("Bike speed is: " + mountainBike.getSpeed());

        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying break is " + mountainBike.getSpeed());
    }
}
