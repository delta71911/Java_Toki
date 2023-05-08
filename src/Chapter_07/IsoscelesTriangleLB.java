package Chapter_07;
import java.util.Scanner;
public class IsoscelesTriangleLB {
    static void putChars(char c, int n) {
        while(n-- > 0)
            System.out.print(c);
    }
    static void putStars(int n) {
        putChars('*', n);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌측으로 직각인 이등변삼각형을 표시합니다.");
        System.out.print("단수는");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            putStars(i);
            System.out.println();
        }
    }
}
