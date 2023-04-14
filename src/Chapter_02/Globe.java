package Chapter_02;
import java.util.Scanner;
public class Globe {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        final double PI = 3.1416;

        System.out.println("구의 포면적과 체적을 구합니다.");
        System.out.println("반경");
        double r = stdIn.nextDouble();

        System.out.println("포면적은? " + (4 * PI * r * r) + "입니다.");
        System.out.println("체적은 " + (4 / 3.0 * PI * r * r * r) + "입니다.");
    }
}
