package Chapter_03;
import java.util.Scanner;
public class Diff2Digits2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 A");     int a = stdIn.nextInt();
        System.out.println("정수 B");     int b = stdIn.nextInt();

        int diff = a >= b ? a - b : b - a;

        System.out.println("차는 " + (diff <= 10 ? "10이하" : "11이상") + "입니다.");
    }
}
