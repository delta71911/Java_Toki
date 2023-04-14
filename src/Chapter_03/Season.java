package Chapter_03;
import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("지금이 몇 월인가요?");
        int month = stdIn.nextInt();

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄이네요");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름이네요");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을이네요");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울이네요");
                break;

        }
    }
}
