package Chapter_06;
import java.util.Scanner;
public class PointSumAve {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("인원수 : ");
        int ninzu = stdIn.nextInt();
        int[] tensu = new int[ninzu];

        System.out.println("점수를 입력하세요.");
        int sum = 0;
        for (int i = 0; i < ninzu; i++) {
            System.out.print((i + 1) + "번의 점수 : ");
            tensu[i] = stdIn.nextInt();
            sum += tensu[i];
        }

        int max = tensu[0];
        int min = tensu[0];
        for (int i = 1; i < ninzu; i++) {
            if (tensu[i] > max)     max = tensu[i];
            if (tensu[i] < min)     min = tensu[i];
        }

        System.out.println("합계점수는 " + sum + "점입니다.");
        System.out.println("평균점수는 " + (double)sum / ninzu + "점입니다.");
        System.out.println("최고점은 " + max + "점입니다.");
        System.out.println("최저점은 " + min + "점입니다.");
    }
}
