package Activity7;

public class mountainBike extends Bicycle{
    public int seatHeight;
    public mountainBike(int gears, int currentSpeed,int startHeight) {
        super(gears, currentSpeed);
        seatHeight=startHeight;
    }
    public void setHeight (int newValue){
        seatHeight = newValue;
    }
    public String bicycleDesc(){
        return (super.bicycleDesc()+ "\n Seat Height is" +seatHeight);
    }
}
