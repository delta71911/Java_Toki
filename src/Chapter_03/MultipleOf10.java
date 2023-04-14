package Chapter_03;
import java.util.Scanner;
public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n > 0)
            if (n % 10 == 0)
                System.out.println("10의 배수입니다.");
            else
                System.out.println("10의 배수가 아닙니다.");
        else
            System.out.println("양의 정수가 아닌 숫자가 입력되었습니다.");
    }
}
