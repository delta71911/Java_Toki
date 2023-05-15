package Chapter_07;
import java.util.Scanner;
public class Min {
    static int min(int a, int b) {
        return a < b ? a : b;
    }
    static int min (int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
   static int min (int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < min)
                min = a[i];
        return min;
   }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("x의 값 : ");    int x = stdIn.nextInt();
        System.out.print("y의 값 : ");    int y = stdIn.nextInt();
        System.out.print("z의 값 : ");    int z = stdIn.nextInt();
        System.out.println("배열 a의 요소수");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("x, y의 최소치는 " + min(x, y) + "입니다.");
        System.out.println("x, y, z의 최소치는 " + min(x, y, z) + "입니다.");
        System.out.println("배열a의 최소치는 " + min(a) + "입니다.");
    }
}
