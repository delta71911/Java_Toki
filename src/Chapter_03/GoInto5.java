package Chapter_03;
import java.util.Scanner;
public class GoInto5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n > 0)
            if (n % 5 == 0)
                System.out.println("5로 나누어 떨어집니다.");
            else
                System.out.println("5로 나누어떨어지지 않습니다.");
        else
            System.out.println("양의 정수가 아닌 숫자가 입력되었습니다.");
    }
}
