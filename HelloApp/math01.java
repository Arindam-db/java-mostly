package HelloApp;


public class math01 {
    public static void main(String[] args) {
        double x = 23.990;
        double a = -26.878;
        double z = 89;

        double y = Math.min(x, a);
        double n = Math.max(x, a);
        double m = Math.abs(a);
        double p = Math.sqrt(z);
        double k = Math.round(x);
        double kk = Math.ceil(x);
        double kp = Math.floor(x);

        System.out.println(y);
        System.out.println(n);
        System.out.println(m);
        System.out.println(p);
        System.out.println(k);
        System.out.println(kk);
        System.out.println(kp);

    }
}
