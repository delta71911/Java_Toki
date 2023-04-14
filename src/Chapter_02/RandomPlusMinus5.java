package Chapter_02;
import java.util.Random;
import java.util.Scanner;
public class RandomPlusMinus5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int x = stdIn.nextInt();

        System.out.println("+-5의 범위 안에서 난수를 발생시켰습니다.");
        System.out.println("값은 " + (x - 5 + rand.nextInt(11)) + "입니다.");
    }
}
