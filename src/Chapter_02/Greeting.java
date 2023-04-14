package Chapter_02;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("성: ");      String lastName = stdIn.next();
        System.out.println("이름: ");     String firstName = stdIn.next();

        System.out.println("안녕!" + lastName + firstName + "씨!!");
    }
}
