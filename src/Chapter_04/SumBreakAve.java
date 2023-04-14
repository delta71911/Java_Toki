package Chapter_04;
import java.util.Scanner;
public class SumBreakAve {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 가산합니다.");
        System.out.println("몇 개를 가산하실 건가요?");
        int n = stdIn.nextInt();

        int sum = 0;
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("정수 (0: 종료)");
            int t = stdIn.nextInt();
            if (t == 0) break;
            sum += t;
        }
        System.out.println("합계는 " + sum + "입니다.");
        if (i != 0)
            System.out.println("평균은 " + sum / i + "입니다.");
    }
}
