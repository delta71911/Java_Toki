package Chapter_02;
import java.util.Random;
public class RandomInteger {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = rand.nextInt(9) + 1;
        int n2 = -rand.nextInt(9) - 1;
        int n3 = rand.nextInt(90) + 10;

        System.out.println("3개의 난수를 생성했습니다.");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
