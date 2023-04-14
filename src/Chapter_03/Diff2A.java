package Chapter_03;
import java.util.Scanner;
public class Diff2A {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a");     int a = stdIn.nextInt();
        System.out.println("정수 b");     int b = stdIn.nextInt();

        int diff = a >= b ? a - b : b - a;

        System.out.println("차를 구하면 " + diff + "입니다.");
    }
}
