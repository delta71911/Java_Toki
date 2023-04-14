package Chapter_04;
import java.util.Random;
import java.util.Scanner;
public class Kazuate2digits {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(90) + 10;

        System.out.println("숫자맞추기 게임~~");
        System.out.println("1~99까지의 숫자 중에서 맞춰보세요");

        int x;
        do {
            System.out.println("어는 숫자려나?");
            x = stdIn.nextInt();

            if (x > no)
                System.out.println("더 작은 수입니다.");
            else if (x < no)
                System.out.println("더 큰수입니다.");

        } while (x != no);

        System.out.println("정답입니다.");
    }
}
