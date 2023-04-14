package Chapter_03;
import java.util.Scanner;
public class Absolute1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if (n >= 0)
            System.out.println("절대값은 " + n + "입니다.");
        else
            System.out.println("절대값은 " + (-n) + "입니다.");
    }

}
