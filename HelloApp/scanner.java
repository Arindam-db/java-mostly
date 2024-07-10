package HelloApp;


import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("whats ur name? ");
        String name = scanner.nextLine();
        
        System.out.println("whats ur age?");
        
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("whats ur fav food?");
        String food = scanner.nextLine();


        System.out.println("hello "+name);

        System.out.println("ur age is "+age+" am i correct?");
        System.out.println("and ur fav food is "+food+" am i correct?");

    }
    
}
