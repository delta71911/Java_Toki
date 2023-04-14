package Chapter_04;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.println("2 이상의 정수치");
            n = stdIn.nextInt();
        } while (n < 2);

        int i;
        for (i = 2; i < n; i++)
            if (n % i == 0)
                break;
        if (i == n)
            System.out.println("그 수는 소수입니다.");
        else
            System.out.println("소수가 아닙니다.");
    }
}
