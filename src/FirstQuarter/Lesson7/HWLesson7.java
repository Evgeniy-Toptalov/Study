package FirstQuarter.Lesson7;

public class HWLesson7 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 30);
        Cat cat2 = new Cat("Mursik", 20);
        Cat cat3 = new Cat("Kuzya", 15);
        Cat cat4 = new Cat("Ryzhik", 25);
        Plate plate = new Plate(80);

        Cat[] arrayCat = {cat1, cat2, cat3, cat4};
        for (int i = 0; i < arrayCat.length; i++) {
            arrayCat[i].eat(plate);
            System.out.println(arrayCat[i].getName() + " наелся? " + arrayCat[i].getSatiety());
        }

        System.out.println("Еды осталось после того как коты поели " + plate.getFoodQuantity());
        plate.addingEat(50);
        System.out.println("Еды стало после добавки " + plate.getFoodQuantity());

    }
}
