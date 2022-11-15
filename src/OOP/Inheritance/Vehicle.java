package OOP.Inheritance;

public class Vehicle {

    private String name;
    private String size;

    private int currVelocity;
    private int currdirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currdirection=0;
        this.currVelocity=0;
    }


    public void steer(int direction){
        this.currdirection+=direction;
        System.out.println("Vehicle.steer() : Steering at" + currdirection + "degrees.");
    }

    public void move(int velocity,int direction){
        currVelocity=velocity;
        currdirection = direction;
        System.out.println("Vehicle.move() : Moving at " + currVelocity + " in direction " + currdirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrVelocity() {
        return currVelocity;
    }

    public int getCurrdirection() {
        return currdirection;
    }


    public void stop(){
        this.currVelocity=0;

    }
}
