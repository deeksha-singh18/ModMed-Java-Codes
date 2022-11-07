package OOP.Inheritance;

public class Animal {
    private String name;
    private int size;
    private int weight;
    private int brain;
    private int body;



    public Animal(String name, int size, int weight, int brain, int body) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.brain = brain;
        this.body = body;
    }


    public void eat(){
        System.out.println("This animal eat function is called");
    }

    public void move(int speed){
        System.out.println("This animal speed is " + speed);
    }




    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }




}
