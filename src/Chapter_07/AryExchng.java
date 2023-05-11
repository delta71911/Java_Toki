package Chapter_07;
import java.util.Scanner;
public class AryExchng {
    static void aryExchng(int[] a, int[] b) {
        int n = a.length < b.length ? a.length : b.length;
        for (int i = 0; i < n; i++) {
            int t = a[i];
            a[i] = b[i];
            b[i] = t;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열a의 요소수");
        int na = stdIn.nextInt();

        int[] a = new int[na];

        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }
        System.out.println("배열b의 요소수");
        int nb = stdIn.nextInt();

        int[] b = new int[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }
        aryExchng(a, b);

        System.out.println("배열a와 b의 모든 요소를 교환하였습니다.");
        for (int i = 0; i < na; i++)
            System.out.println("a[" + i + "] = "+ a[i]);
        for (int i = 0; i < nb; i++)
            System.out.println("b[" + i + "] = " + b[i]);
    }
}
