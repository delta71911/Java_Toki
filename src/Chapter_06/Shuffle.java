package Chapter_06;
import java.util.Random;
import java.util.Scanner;
public class Shuffle {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소의 갯수");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {           // 인덱스 범위에 문제가 있는건지 이거 역시 작동이 안된다.
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for (int i = n - 1; i > 0; i--) {           // Fisher-Yates 알고리즘을 사용하니 잘 작동됨. 효율도 훨씬 좋다고함.
            int j = rand.nextInt(i + 1);
            if (i != j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        System.out.println("각 요소들을 셔플했습니다.");
        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
