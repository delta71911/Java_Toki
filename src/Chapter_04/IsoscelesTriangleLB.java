package Chapter_04;
import java.util.Scanner;
public class IsoscelesTriangleLB {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌측으로 직각인 이등변삼각형을 표시합니다.");
        System.out.println("단수는?");

        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
