package HelloApp;

import java.util.Random;


public class random {
    public static void main(String[] args){
        Random rd = new Random();

        int x = rd.nextInt(6);   // This will print a random between 0 and 5
        x++;   // This will print a random between 1 and 6 now

        System.out.println("random numb between 1 and 6:  "+x);

        double z = rd.nextDouble(); // random between 0 and 1
        System.out.println("random between 0 and 1:  "+z);

        boolean p = rd.nextBoolean();
        System.out.println("are you dumb: "+p);

    }
    
}
