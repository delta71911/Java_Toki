package Chapter_07;
import java.util.Random;
import java.util.Scanner;
public class RandomTester {
    static int random(int a, int b) {
        if (b <= a)
            return a;
        else {
            Random rand = new Random();
            return a + rand.nextInt(b - a + 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("난수를 발생합니다.");
        System.out.print("하한치: ");      int min = stdIn.nextInt();
        System.out.print("상한치: ");      int max = stdIn.nextInt();
        System.out.println("생성한 난수는 " + random(min, max) + "입니다.");
    }
}
