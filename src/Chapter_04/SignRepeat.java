package Chapter_04;
import java.util.Scanner;
public class SignRepeat {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        do {
            System.out.println("정수치");
            int n = stdIn.nextInt();

            if (n > 0)
                System.out.println("양의 정수입니다.");
            else if (n < 0)
                System.out.println("음의 정수입니다.");
            else
                System.out.println("0입니다.");

            do {
                System.out.println("한번 더? 1-yes, 0-no");
                retry = stdIn.nextInt();
            } while (retry != 0 && retry != 1);
        } while (retry == 1);
    }
}
