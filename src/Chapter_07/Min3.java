package Chapter_07;
import java.util.Scanner;
public class Min3 {
    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수a : ");       int a = stdIn.nextInt();
        System.out.println("정수b : ");       int b = stdIn.nextInt();
        System.out.println("정수c : ");       int c = stdIn.nextInt();

        System.out.println("최소치는 " + min(a, b, c) + "입니다.");
    }
}
