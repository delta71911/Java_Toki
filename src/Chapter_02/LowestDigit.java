package Chapter_02;
import java.util.Scanner;
public class LowestDigit {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수치: ");
        int x = stdIn.nextInt();

        System.out.println("첫쨰자리를 지웁니다." + (x / 10));
        System.out.println("최하위에 있는 수는 " + (x % 10));
    }
}
