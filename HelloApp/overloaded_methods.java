package HelloApp;

public class overloaded_methods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters 
        //                      method name + parameter = method signature

        int x =add(2,3,4);
        System.out.println(x);

    }
    static int add(int x, int y){
        System.out.println("this is overloaded method 1");
        return x + y;
    }
    static int add(int x, int y, int z){
        System.out.println("this is overloaded method 2");
        return x + y + z;
    }
    static int add(int x, int y, int z, int p){
        System.out.println("this is overloaded method 3");
        return x + y + z + p;
    }
}
