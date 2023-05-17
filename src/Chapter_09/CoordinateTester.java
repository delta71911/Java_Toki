package Chapter_09;
import java.util.Scanner;
public class CoordinateTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요");
        System.out.print("x좌표");
        double x = stdIn.nextDouble();
        System.out.print("y좌표");
        double y = stdIn.nextDouble();

        Coordinate p = new Coordinate(x, y);
        System.out.println("p = " + p);
        Coordinate q = new Coordinate(p);

        System.out.println("q, p같은 좌표를 만들었습니다.");
        System.out.println("q = " + q);

        if (p.equalTo(q))
            System.out.println("p q가 같습니다.");
        else
            System.out.println("p q가 같지않습니다.");

        Coordinate c1 = new Coordinate();
        Coordinate c2 = new Coordinate(1.1, 2.2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        Coordinate[] a = new Coordinate[3];
        for (int i = 0; i < a.length; i++)
            a[i] = new Coordinate();

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
