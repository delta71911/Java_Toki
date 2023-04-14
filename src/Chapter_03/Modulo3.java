package Chapter_03;
import java.util.Scanner;
public class Modulo3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n > 0)
            if (n % 3 == 0)
                System.out.println("3으로 나누어 떨어집니다.");
            else if (n % 3 == 1)
                System.out.println("나머지는 1입니다.");
            else
                System.out.println("나머지는 2입니다.");
        else
            System.out.println("양의 정수가 아닌 숫자가 입력되었습니다.");
    }
}

