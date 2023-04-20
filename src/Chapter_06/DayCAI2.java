package Chapter_06;
import java.util.Random;
import java.util.Scanner;
public class DayCAI2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] dayKorean = {
                "일", "월", "화", "수", "목", "금", "토"
        };
        String[] dayEnglish = {
                "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
        };

        System.out.println("영어 소문자로 요일을 입력하세요");


        // 정답을 입력해도 다르다고 나온다. 완벽한 프로그램은 아님.

        int retry;
        int last = -1;
        do {
            int day;
            do {
                day = rand.nextInt(7);
            } while (day == last);
            last = day;

            int action;
            do {
                System.out.print(dayKorean[day] + "요일 : ");
                String s = stdIn.next();

                if (s.equals(dayKorean[day])) {
                    System.out.println("정답입니다.");
                    break;
                }
                System.out.println("다릅니다.");
                do {
                    System.out.println("어떻게 하실건가요? 1-재입력, 0-정답보기");
                    action = stdIn.nextInt();
                } while (action != 0 && action != 1);
                if (action == 0)
                    System.out.println(dayKorean[day] + "요일은 " + dayEnglish[day] + "입니다.");
            } while (action == 1);

            System.out.print("한번 더? 1-Yes/0-No");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
