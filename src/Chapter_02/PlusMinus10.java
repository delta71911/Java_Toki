package Chapter_02;
import java.util.Scanner;
public class PlusMinus10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수치 ");
        int x = stdIn.nextInt();

        System.out.println("10을 더하면 " + (x + 10) + "이 됩니다.");
        System.out.println("10을 빼면 " + (x - 10) + "이 됩니다.");
    }
}
