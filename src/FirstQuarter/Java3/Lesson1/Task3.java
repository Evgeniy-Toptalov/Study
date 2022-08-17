package FirstQuarter.Java3.Lesson1;

public class Task3 {
    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        for (int i = 0; i < 10; i++) {
            orangeBox.addOrange(new Orange());
        }
        for (int i = 0; i < 15; i++) {
            appleBox.addApple(new Apple());
        }

        orangeBox.info();
        appleBox.info();

        Float orangeBoxWeight = orangeBox.getWeight();
        Float appleBoxWeight = appleBox.getWeight();
        System.out.println("Коробка с аппельсинами весит " + orangeBoxWeight);
        System.out.println("Коробка с яблоками весит " + appleBoxWeight);

        System.out.println("Вес коробки с аппельсинами и вес коробки с яблоками равны: " + orangeBox.compare(appleBox));

    }

}
