package HelloApp;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // Variables in java

        int age = 78;
        char gender = 'f';
        boolean chad = false;
        double experience = 0.001;
        
        System.out.println(+ age);
        System.out.println(""+ gender);
        System.out.println(""+ chad);
        System.out.println(""+ experience);

        //Change of data of variables

        String a = "idk";
        String b = "ik";
        String temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);

    }
}