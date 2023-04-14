package Chapter_03;
import java.util.Scanner;
public class Grade1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("점수");
        int point = stdIn.nextInt();

        if (point >= 0 && point <= 59)
            System.out.println("불가");
        else if (point >= 60 && point <= 69)
            System.out.println("가");
        else if (point >= 70 && point <= 79)
            System.out.println("영");
        else if (point >= 80 && point <= 100)
            System.out.println("우");
        else
            System.out.println("알 수 없는 점수입니다.");
    }
}
