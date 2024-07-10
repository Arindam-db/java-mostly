package HelloApp;

import java.util.Scanner;

public class hypo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double x,y,z;

        System.out.println("Enter the side x:");
        x = scan.nextDouble();

        System.out.println("Enter the side y:");
        y = scan.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypo is:"+z);

        Scan.close();
    }
    
}

