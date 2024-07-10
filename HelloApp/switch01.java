package HelloApp;

public class switch01 {
    public static void main(String[] args){
        //statement that allows a variable to be tested for equally against a list of values

        String favFood = "kuch nhi";

        switch(favFood){
            case "pizza": System.out.println("fav food is pizza"); break;
            case "maggie": System.out.println("fav food is maggie"); break;
            case "banana": System.out.println("fav food is banana"); break;
            case "oreo": System.out.println("fav food is oreo"); break;
            case "kuch nhi": System.out.println("fav food is kuch nhi"); break;
            default: System.out.println("not found"); break;
        }
    }

}