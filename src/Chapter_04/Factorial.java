package Chapter_04;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.println("정수치");
            n = stdIn.nextInt();
        } while (n <= 0);

        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("1부터 " + n + "까지의 곱은 " + factorial + "입니다.");
    }
}
