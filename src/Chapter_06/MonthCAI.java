package Chapter_06;
import java.util.Random;
import java.util.Scanner;
public class MonthCAI {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        String[] monthString = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        System.out.println("영어로 몇월인지 입력하세요.");
        System.out.println("맨 앞글자는 대문자로 그 다음부터는 소문자로 입력해주세요.");

        int retry;
        int last = -1;

        do {
            int month;
            do {
                month = rand.nextInt(12);
            } while (month == last);

            while (true) {
                System.out.print((month + 1) + "월: ");
                String s = stdIn.next();

                if (s.equals(monthString[month])) break;
                System.out.println("다릅니다.");
            }
            System.out.print("정답입니다. 한번 더? 1:yes, 0:no");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
