package HelloApp;

public class array2d {
    public static void main(String[] args) {
        // 2d array
        String[][] cars = new String[3][3];

        cars[0][0] = "ena";
        cars[0][1] = "meena";
        cars[0][2] = "deeka";

        cars[1][0] = "jay";
        cars[1][1] = "jama";
        cars[1][2] = "cheeka";

        cars[2][0] = "ena";
        cars[2][1] = "meena";
        cars[2][2] = "deeka";

        // printing the whole array
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
