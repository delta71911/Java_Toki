package Chapter_07;
import java.util.Scanner;
public class MinOfHeightWeight {
    static int minOf(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < min)
                min = a[i];
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("인원수는 : ");
        int people = stdIn.nextInt();

        int[] height = new int[people];
        int[] weight = new int[people];

        System.out.println(people + "명의 키와 체중을 입력하세요.");

        for (int i = 0; i < people; i++) {
            System.out.print((i + 1) + "번쨰의 키: ");
            height[i] = stdIn.nextInt();
            System.out.print((i + 1) + "번쨰의 체중: ");
            weight[i] = stdIn.nextInt();
        }
        System.out.println("키가 가장 작은 사람의 키: " + minOf(height) + "cm");
        System.out.println("가장 날씬한 사람의 체중: " + minOf(weight) + "kg");
    }
}
