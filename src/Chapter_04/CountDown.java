package Chapter_04;
import java.util.Scanner;
public class CountDown {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("카운트다운 합니다.");
        int x;

        do {
            System.out.println("양의 정수");
            x = stdIn.nextInt();
        } while (x <= 0);

        while (x >= 0)
            System.out.println(--x);
        System.out.println("x의 값은" + x + "가 되었습니다.");
    }
}
