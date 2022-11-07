package OOP.Inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tails;
    private String coat;
    private int teeth;


    public Dog(String name, int size, int weight, int eyes, int legs, int tails, String coat, int teeth) {
        super(name, size, weight, 1, 1);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.coat = coat;
        this.teeth = teeth;
    }


    private void chew(){
        System.out.println("Dog class chew function is called");
    }

    @Override
    public void eat() {
        chew();
        super.eat();

        System.out.println("Dog.eat() is called");
    }


    @Override
    public void move(int speed) {
        super.move(speed);
        moveLegs(6);
        System.out.println("dog.move() is called");
    }

    private void moveLegs(int speed){
        System.out.println("dog.moveLegs() is called");

    }

    public void walk(){
        move(9);
        System.out.println("dog.walk() is called");
    }

    public void run(){
        move(9);
        System.out.println("dog.run() is called");
    }
}
