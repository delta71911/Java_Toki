package Chapter_04;
import java.util.Scanner;
public class PutAsteriskFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("별이 몇 개?");
        int n = stdIn.nextInt();

        if ( n > 0 ) {
            for(int i = 0; i < n; i++)
                System.out.print('*');
            System.out.println();
        }
    }
}
