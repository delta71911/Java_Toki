package Chapter_03;
import java.util.Scanner;
public class Sign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("양의 정수입니다.");
        else if (n < 0)
            System.out.println("음의 정수입니다.");
        else
            System.out.println("0입니다.");
    }
}
