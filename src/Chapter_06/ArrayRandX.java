package Chapter_06;
import java.util.Random;
import java.util.Scanner;
public class ArrayRandX {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소의 갯수");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        a[0] = 1 + rand.nextInt(10);

        for (int i = 0; i < n; i++)
            do {
                a[i] = 1 + rand.nextInt(10);
            } while (a[i] == a[i - 1]);     // 선두요소를 따로 선언했는데도 이 부분에서오류가 나는데 원인을 모르겠다.

        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
