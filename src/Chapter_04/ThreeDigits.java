package Chapter_04;
import java.util.Scanner;
public class ThreeDigits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x;
        do {
            System.out.println("세 자리의 정수");
            x = stdIn.nextInt();
        } while (x < 100 || x > 999);
        System.out.println(x + "라고 입력하셨습니다.");
    }
}
