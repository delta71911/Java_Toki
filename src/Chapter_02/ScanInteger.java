package Chapter_02;
import java.util.Scanner;
public class ScanInteger {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수치: ");
        int x = stdIn.nextInt();

        System.out.println(x + "라고 입력하셨군요.");
    }
}
