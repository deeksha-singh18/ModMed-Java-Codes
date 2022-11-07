package OOP.Inheritance;

public class CallingClass {
    public static void main(String[] args) {

        Animal animal = new Animal("Cat",2,45,1,1);
        Dog dog = new Dog("Cat",2,45,2,4,1,"Fur",34);

//        dog.eat();
//        dog.run();
//        dog.walk();
        Fish fish = new Fish("Whale",4,45,67,2,4);
        fish.swim(67);

    }




}
