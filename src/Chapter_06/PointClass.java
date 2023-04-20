package Chapter_06;
import java.util.Scanner;
public class PointClass {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        /*

        올바르게 작동 안됨

         */

        System.out.print("클래스 갯수");
        int classNum = stdIn.nextInt();

        int[][] point = new int[classNum][];

        int people = 0;

        for (int i = 0; i < point.length; i++) {
            System.out.printf("\n%d반의 인원수 : ", i + 1);
            int num = stdIn.nextInt();
            point[i] = new int[num];
            people += num;
            for (int j = 0; j < point[i].length; j++) {
                System.out.printf("%d반 %d번의 점수 : ", i + 1, j + 1);
            }
        }

        System.out.println("  반 |    합계    평균");
        System.out.println("----+---------------");
        int total = 0;
        for (int i = 0; i < point.length; i++) {
            int sum = 0;
            for (int j = 0; j < point[i].length; j++)
                sum += point[i][j];
            total += sum;
            System.out.printf("%2d반 |%7d%7.1f\n", i + 1, sum, (double)sum / point[i].length);
        }
        System.out.println("----+----------------");
        System.out.printf("  계 |%7d%7.1f\n", total, (double)total / people);
    }
}
