package HelloApp;

public class printf {
    // printf = an optional method to control, format , and display text to the console window 
    //          two arguments = format string + object (object/variable/value)
    //          % [flags] [precision] [width] [conversion-character]
    public static void main(String[] args){
        boolean myboolean = false;
        int p = 78;
        double k = 23.67;
        char mychar = '@';
        String myString = "nrh";

        // [conversion character]
        System.out.printf("%b",myboolean);
        System.out.printf("%d",p);
        System.out.printf("%f",k);
        System.out.printf("%c",mychar);
        System.out.printf("%s",myString);

    }
}
