package Chapter_03;
import java.util.Random;
public class FingerFlashing {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("컴퓨터의 선택");
        int hand = rand.nextInt(3);

        switch(hand) {
            case 1:
                System.out.println("묵");    break;
            case 2:
                System.out.println("찌");    break;
            case 3:
                System.out.println("빠");    break;
        }
    }
}
