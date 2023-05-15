package Chapter_08;

public class CarTester1 {
    public static void main(String[] args) {
        Car vitz = new Car("비츠", "후쿠오카99999-99", 1660, 1500, 3640, 40.0, 35.0, 12.0);
        Car march = new Car("마치", "후쿠오카88888-98", 1660, 1525, 3695, 41.0, 35.0, 12.0);

        vitz.putSpec();
        System.out.println();
        march.putSpec();
    }
}
