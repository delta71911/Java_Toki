package Chapter_08;
import java.util.Scanner;
public class CarTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("자동차의 데이터를 입력하세요");
        System.out.print("이름");     String name = stdIn.next();
        System.out.print("넘버");     String number = stdIn.next();
        System.out.print("차폭");     int width = stdIn.nextInt();
        System.out.print("차고");     int height = stdIn.nextInt();
        System.out.print("전장");     int length = stdIn.nextInt();
        System.out.print("탱크용량");     double tank = stdIn.nextDouble();
        System.out.print("가솔린양");     double fuel = stdIn.nextDouble();
        System.out.print("연비");     double sfc = stdIn.nextDouble();

        Car myCar = new Car(name, number, width, height, length, tank,fuel, sfc);

        while (true) {
            System.out.printf("현재 위치 : (%.2f, %.2f)\n", myCar.getX(), myCar.getY());
            System.out.printf("남은 연료 : %.2f\n", myCar.getFuel());
            System.out.printf("이동하시겠습니까? 0 no 1 yes");
            if (stdIn.nextInt() == 0) break;

            System.out.println("x 방향의 이동거리 : ");
            double dx = stdIn.nextDouble();
            System.out.println("y 방향의 이동거리 : ");
            double dy = stdIn.nextDouble();

            if (!myCar.move(dx, dy))
                System.out.println("연료부족!!");
        }

    }
}
