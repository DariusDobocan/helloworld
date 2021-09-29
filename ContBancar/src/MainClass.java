import java.util.Random;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        double a = sc.nextFloat();

        double b = sc.nextFloat();*/

        double var = 0.0;

        Random rnd = new Random();

        ContBancar cb = new ContBancar(500);
        cb.depozitareSuma(300);
        var = cb.getSold();
        System.out.print("Soldul actual este: " + var + " ");

        for (int i = 0; i < rnd.nextInt(1000); ++i) {
            if (rnd.nextInt(2) == 0) {
                cb.depozitareSuma(rnd.nextInt(100));
                System.out.print(var + " ");
            } else if (cb.retragereSuma(rnd.nextInt(100))) {
                var = cb.getSold();
                System.out.print(var + " ");
            } else System.out.print("Sold insuficient");
        }


    }
}
