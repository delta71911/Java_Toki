package Chapter_04;
import java.util.Scanner;
public class Square1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n을 입력하세요.");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "의 이제곱은 " + i * i);
        }
    }
}
