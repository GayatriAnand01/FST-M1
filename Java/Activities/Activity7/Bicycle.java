package Activity7;

public class Bicycle implements BicycleParts,BicycleOperations {
    public int gears;
    public int currentSpeed;

    public Bicycle(int gears,int currentSpeed){
        this.gears=gears;
        this.currentSpeed=currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        currentSpeed -=decrement;
        System.out.println("Current Speed = "+currentSpeed);
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current Speed = "+currentSpeed);
    }

    public String bicycleDesc(){
        return("No of gears are "+gears+"\n Speed of bicycle is "+currentSpeed );
    }
}
