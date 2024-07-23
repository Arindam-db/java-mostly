package HelloApp;

public class array01 {
    public static void main(String[] args){
        //array stores multiple values in a single varaible

       /*  String[] cars ={"suzuki", "imaginaryCar", "Tesla"};

    
        cars[1] = "honda";

        System.out.println(cars[0]);
        System.out.println(cars[1]); */


        //type 2 of arrays

        /* String[] bikes = new String[3];

        bikes[0] = "bajaj";
        bikes[1] = "Honda";
        bikes[2] = "Hero";

        System.out.println(bikes[2]);  */


        //using for loop to print all elements
        String[] bikes = new String[3]; 

        bikes[0] = "bajaj";
        bikes[1] = "Honda";
        bikes[2] = "Hero";

        for(int i=0; i<bikes.length; i++){
            System.out.println(bikes[i]);
        }
    }
}
