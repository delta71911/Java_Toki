package Chapter_02;
import java.util.Scanner;
public class SumAveDouble {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("x");
        double x = stdIn.nextDouble();

        System.out.println("y");
        double y = stdIn.nextDouble();

        System.out.println("합계는 " + (x + y));
        System.out.println("평균은 " + (x + y) / 2);
    }
}
