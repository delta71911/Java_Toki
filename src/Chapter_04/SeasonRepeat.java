package Chapter_04;
import java.util.Scanner;
public class SeasonRepeat {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int retry;

        System.out.println("계절을 구합니다.");
        do {
            int month;
            do {
                System.out.println("몇 월인가요?");
                month = stdIn.nextInt();
            } while (month < 1 || month > 12);

            if (month >= 3 && month <= 5)
                System.out.println("봄입니다.");
            else if (month >= 6 && month <= 8)
                System.out.println("여름입니다.");
            else if (month >= 9 && month <= 11)
                System.out.println("가을입니다.");
            else if (month == 12 || month == 1 || month == 2)
                System.out.println("겨울입니다.");

            System.out.println("한번 더? 1 - yes, 0 - no");
            retry = stdIn.nextInt();

        } while (retry == 1);
    }
}
