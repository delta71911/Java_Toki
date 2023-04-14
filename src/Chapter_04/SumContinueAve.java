package Chapter_04;
import java.util.Scanner;
public class SumContinueAve {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 가산합니다.");
        System.out.println("몇 개를 가산할까요?");
        int n = stdIn.nextInt();

        int sum = 0;
        int count = 0;
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("정수");
            int t = stdIn.nextInt();
            if (t < 0) {
                System.out.println("음의 정수는 가산하지 않습니다.");
                continue;
            }
            sum += i;
            count++;
        }
        System.out.println("합계는 " + sum + "입니다.");
        if (count != 0)
            System.out.println("평균은 " + sum / count + "입니다.");
    }
}
