package Chapter_04;
import java.util.Scanner;
public class DigitNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수의 행을 구합니다.");
        int x;
        do {
            System.out.print("정수치");
            x = stdIn.nextInt();
        } while (x <= 0);

        int digits = 0;
        while (x > 0) {
            digits++;
            x /= 10;
        }
        System.out.println("그 수는 " + digits + "자리 수입니다.");
    }
}
