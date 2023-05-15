package Chapter_08;
class Human {
    String name;
    int height;
    int weight;
    Human(String n, int h, int w) {
        name = n; height = h; weight = w;
    }
    String getName() { return name; }
    int getHeight() { return height; }
    int getWeight() { return weight; }

    void gainWeight(int w) { weight += w; }
    void reduceWeight(int w) { weight -= w; }
}
public class HumanTester {
    public static void main(String[] args) {
        Human suzuki = new Human("JIRO SUZUKI", 170, 60);
        Human takada = new Human("RYUICHI TAKADA", 166, 72);

        suzuki.gainWeight(3);
        takada.reduceWeight(5);
//        suzuki.name = "JIRO SUZUKI";
//        suzuki.height = 170;
//        suzuki.weight = 60;
//
//        takada.name = "RYUICHI TAKADA";
//        takada.height = 166;
//        takada.weight = 72;

        System.out.println("이름 : " + suzuki.name);
        System.out.println("신장 : " + suzuki.height + "cm");
        System.out.println("체중 : " + suzuki.weight + "kg");
        System.out.println();

        System.out.println("이름 : " + takada.name);
        System.out.println("신장 : " + takada.height + "cm");
        System.out.println("체중 : " + takada.weight + "kg");
    }
}
