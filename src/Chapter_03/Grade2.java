package Chapter_03;
import java.util.Scanner;
public class Grade2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("점수");
        int point = stdIn.nextInt();
        
        if (point < 0 || point > 100)
            System.out.println("알 수 없는 점수입니다.");
        else if (point <= 59)
            System.out.println("낙제");
        else if (point <= 69)
            System.out.println("가");
        else if (point <= 79)
            System.out.println("양");
        else
            System.out.println("우");
    }
}
