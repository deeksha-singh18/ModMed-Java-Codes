package ArrayList;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<>();



    public void addGroceryItem(String item) {
        groceryList.add(item);

    }


    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + "." + groceryList.get(i));

        }
    }


    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified");

    }


    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);


    }


    public static void main(String[] args) {
        GroceryList obj = new GroceryList();
        obj.groceryList.add("Milk");
        obj.groceryList.add("Bread");
        obj.groceryList.add("Butter");
        obj.groceryList.add("Chocolate");

        obj.printGroceryList();
        System.out.println();

        obj.modifyGroceryItem(2,"Icecream");

        System.out.println();

        obj.printGroceryList();

        obj.removeGroceryItem(1);

        System.out.println();

        obj.printGroceryList();



    }





}
