package Chapter_04;
import java.util.Random;
import java.util.Scanner;
public class Kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        final int MAX_NO = 6;
        int leftNo = MAX_NO;
        int no = rand.nextInt(100);

        System.out.println("숫자맞추기 게임!");
        System.out.println("0~99까지의 수를 맞춰보세요");

        int x;
        do {
            System.out.println("남은기회 " + (leftNo--) + "회");
            x = stdIn.nextInt();

            if (x > no)
                System.out.println("더 작은 수입니다.");
            else if (x < no)
                System.out.println("더 큰 수 입니다.");
        } while (x != no && leftNo > 0);

        if (x == no)
            System.out.println((MAX_NO - leftNo) + "회만에 맞추셨군요!");
        else
            System.out.println("이런! 정답은 " + no + "입니다.");
    }
}
