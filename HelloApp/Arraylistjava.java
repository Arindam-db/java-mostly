package HelloApp;

import java.util.ArrayList;

public class Arraylistjava {
    public static void main(String[] args){
        //arraylist = resizeable array 
        //              elements can be added and removed after completion phase 
        //              store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("pepsi");
        food.add("roti");

        //some usefull methods of array list ;) 

        food.set(0, "rasmalai"); // changing the value from pizza to rasmalai
        food.remove(2); //removes the element
        food.clear();


        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

    }
}
