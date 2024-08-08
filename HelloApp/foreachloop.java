package HelloApp;

import java.util.ArrayList;

public class foreachloop {
    private static final boolean String = false;

    public static void main(String[] args){
     //for each loop = transversing technique to iterate through the elements in an array/collection
     //                 less steps , more readable   
     //                 less flexible
    
    //String[] animals = {"bird" , "hen" ,"elephant", "cat", "rat"};


    ArrayList<String> animals = new ArrayList<String>();

        animals.add("pigeon");
        animals.add("kabutar");
        animals.add("parrot");
        animals.add("cat");
        animals.add("hen");
        animals.add("goat");


        for(String i : animals){
            System.out.println(i);
        }
    }    
}
