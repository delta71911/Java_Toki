package Chapter_02;
import java.util.Random;
public class RandomDouble {
    public static void main(String[] args) {
        Random rand = new Random();

        double x1 = rand.nextDouble();
        double x2 = rand.nextDouble() * 10;
        double x3 = -1 + 2 * rand.nextDouble();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
