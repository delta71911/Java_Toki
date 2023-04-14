package Chapter_04;
import java.util.Arrays;
import java.util.Scanner;
public class PutAsteriskAlt1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("몇 개 표시할까요?");
        int n = stdIn.nextInt();

        if (n > 0) {
            int i = 0;
            while (i < n) {
                if (i % 2 == 0)
                    System.out.print('*');
                else
                    System.out.print('+');
                i++;
            }
            System.out.println();
        }
    }
}
