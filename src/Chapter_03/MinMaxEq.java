package Chapter_03;
import java.util.Scanner;
public class MinMaxEq {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a");     int a = stdIn.nextInt();
        System.out.println("정수 b");     int b = stdIn.nextInt();

        if (a == b)
            System.out.println("a와 b는 같은 수입니다.");
        else {
            int min, max;
                    if (a < b) {
                        min = a;
                        max = b;
                    } else {
                        min = b;
                        max = a;
                    }
            System.out.println("작은 수는 " + min + "입니다.");
            System.out.println("큰 수는 " + max + "입니다.");
        }
    }
}
