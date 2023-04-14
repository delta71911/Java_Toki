package Chapter_03;
import java.util.Scanner;
public class Negative {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n < 0)
            System.out.println("그 수는 음의 정수입니다.");
    }
}
