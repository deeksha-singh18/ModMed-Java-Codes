package OOP.Inheritance;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;


    private int currGear;

    public void changeGear(int currGear) {
        this.currGear = currGear;
        System.out.println("Car.setCurrGear() : changed to " + this.currGear + "gear.");
    }


//    public void changeVelocity(int speed,int direction)

    @Override
    public void stop() {
        super.stop();
    }

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currGear = 1;
    }



}
