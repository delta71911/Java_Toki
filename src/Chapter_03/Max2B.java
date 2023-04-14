package Chapter_03;
import java.util.Scanner;
public class Max2B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("실수 a");     double a = stdIn.nextDouble();
        System.out.println("실수 b");     double b = stdIn.nextDouble();

        double max = a > b ? a : b;

        System.out.println("큰 수치는" + max + "입니다.");
    }
}
