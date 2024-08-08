package HelloApp;

import java.util.*;

public class arraylist {
    public static void main(String[] args){
        // 2d arraylist = a dynamc list of lists
        // you can change the size of the lists during run time 
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("garlic");

        ArrayList<String> productList = new ArrayList();
        productList.add("aloo");
        productList.add("tomato");
        productList.add("onion");

        groceryList.add(bakeryList);
        groceryList.add(productList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1));

    }
    
}
