package FirstQuarter.Lesson6;

public class HWLesson6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik", 3000, 25);
        Dog dog2 = new Dog("Baskervil", 50000, 5000);
        Cat cat1 = new Cat("Barsik", 300, 0);
        Cat cat2 = new Cat("Mursik", 100, 0);


        dog1.run(5000);
        dog1.swim(20);
        dog2.run(30000);
        dog2.swim(1000);
        cat1.run(50);
        cat1.swim(10);
        cat2.run(150);
        cat2.swim(1);

        System.out.println("Всего созданно животных " + Animal.getCount());
    }
}
