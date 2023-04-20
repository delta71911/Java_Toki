package Chapter_06;
import java.util.Random;
import java.util.Scanner;
public class DayCAI1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] dayKorean = {
                "일", "월", "화", "수", "목", "금", "토"
        };
        String[] dayEnglish = {
                "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
        };

        System.out.println("영어로 요일을 소문자로 입력해주세요.");

        int retry;
        int last = -1;

        do {
            int day;
            do {
                day = rand.nextInt(7);
            } while (day == last);
            last = day;

            while (true) {
                System.out.print(dayKorean[day] + "요일 : ");
                String s = stdIn.next();

                if (s.equals(dayEnglish[day])) break;
                System.out.println("다릅니다.");
            }
            System.out.print("정답입니다. 한번 더? 1-yes, 0-no");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
