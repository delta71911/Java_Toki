package Chapter_03;
import java.util.Scanner;
public class Med3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a");     int a = stdIn.nextInt();
        System.out.println("정수 b");     int b = stdIn.nextInt();
        System.out.println("정수 c");     int c = stdIn.nextInt();

        int med;
        if (a >= b)
            if (b >= c)
                med = b;
            else if (a <= c)
                med = a;
            else
                med = c;
        else if (a > c)
            med = a;
        else
            med = b;

        System.out.println("중앙치는 " + med + "입니다.");
    }
}
