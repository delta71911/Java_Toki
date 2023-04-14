package Chapter_02;

public class SumAve3B {
    public static void main(String[] args) {
        int x, y, z;
        int sum;

        x = 63;
        y = 18;
        z = 52;
        sum = x + y + z;

        System.out.println("x는 " + x + "입니다.");
        System.out.println("y는 " + y + "입니다.");
        System.out.println("z은 " + z + "입니다.");
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + sum / 3 + "입니다.");
    }
}
