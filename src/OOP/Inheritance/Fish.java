package OOP.Inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, int size, int weight,  int gills, int eyes, int fins) {
        super(name, size, weight, 1,1);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }


    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(45);

    }




}
