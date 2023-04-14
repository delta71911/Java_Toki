package Chapter_03;
import java.util.Scanner;
public class Measure2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("변수 a");     int a = stdIn.nextInt();
        System.out.println("변수 b");     int b = stdIn.nextInt();

        if(!(a % b == 0))
            System.out.println("b는 a의 약수가 아닙니다.");
        else
            System.out.println("b는 a의 약수입니다.");
    }
}
