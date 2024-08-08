package HelloApp;

public class method {
    public static void main(String[] args){
        // method = a block of code which is executed when called upon
    
        int a = 6;
        int b = 5;
        System.out.println(add(a, b));

        String name = "lmao";
        print(name);
    }
    static int add(int x, int y){
        return x + y;
    }
    static void print(String name){
        System.out.println(name);
    }
}
