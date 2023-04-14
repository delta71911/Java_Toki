package Chapter_03;
import java.util.Scanner;
public class BalanceWrong {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("변수 a");     int a = stdIn.nextInt();
        System.out.println("변수 b");     int b = stdIn.nextInt();

        int diff = a - b;
        if (diff > 0)
            System.out.println("a가 더 큽니다.");
        else if (diff < 0)
            System.out.println("b가 더 큽니다.");
        else
            System.out.println("서로 같은 값입니다.");
    }
}
