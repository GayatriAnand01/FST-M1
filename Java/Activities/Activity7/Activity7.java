package Activity7;

public class Activity7 {

    public static void main(String[] args) {
        mountainBike mb = new mountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
