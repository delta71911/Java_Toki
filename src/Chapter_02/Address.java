package Chapter_02;
import java.util.Scanner;
public class Address {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("주소");
        String address = stdIn.nextLine();

        System.out.println("사시는 곳은 " + address + "이시군요!");
    }
}
