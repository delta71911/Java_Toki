package Chapter_06;
import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("요소수");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        System.out.printf("a = {");
        if (n >= 2)
            for (int i = 0; i < n - 1; i++)
                System.out.printf(a[i] + ", ");
        if (n >= 1)
            System.out.print(a[n - 1]);
        System.out.printf("}");
    }
}
