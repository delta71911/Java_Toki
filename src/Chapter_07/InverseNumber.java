package Chapter_07;
import java.util.Scanner;
public class InverseNumber {
    static Scanner stdIn = new Scanner(System.in);

    static int readPlusInt() {
        int x;
        do {
            System.out.print("양의 정수치: ");
            x = stdIn.nextInt();
        } while (x <= 0);
        return x;
    }

    public static void main(String[] args) {
        int x;
        do {
            int n = readPlusInt();
            System.out.print("거꾸로 읽으면");
            while (n > 0) {
                System.out.print(n % 10);
                n /= 10;
            }
            System.out.println("입니다.");
            do {
                System.out.print("한번 더? 1 Yes 0 No");
                x = stdIn.nextInt();
            } while (x != 0 && x != 1);
        } while (x == 1);
    }
}
