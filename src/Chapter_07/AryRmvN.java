package Chapter_07;
import java.util.Scanner;
public class AryRmvN {
    static void aryRmvN (int[] a, int idx, int n) {
        if (n > 0 && idx >= 0 && idx + n < a.length) {
            int idx2 = idx + n - 1;
            if(idx2 > a.length - n - 1)
                idx2 = a.length - n - 1;
            for(int i = idx; i <= idx2; i++)
                a[i] = a[i + n];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소수");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }
        System.out.print("삭제하는 시작 인덱스 : ");
        int idx = stdIn.nextInt();
        System.out.print("삭제하는 요소의 개수 : ");
        int n = stdIn.nextInt();

        aryRmvN(a, idx, n);

        for (int i = 0; i < num; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
