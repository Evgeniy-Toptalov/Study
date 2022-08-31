package FirstQuarter.Java3.Lesson5;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

//не смог синхронизировать сообщения ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!" и ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!

public class MainClass {
    public static final int CARS_COUNT = 4;
    private static ExecutorService executorService = Executors.newFixedThreadPool(CARS_COUNT);
    public static final AtomicInteger finishCount = new AtomicInteger(0);

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        CyclicBarrier cb = new CyclicBarrier(CARS_COUNT + 1);
        CountDownLatch cdl = new CountDownLatch(CARS_COUNT);
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, cdl, finishCount);
        }
        for (int i = 0; i < cars.length; i++) {
            executorService.execute(cars[i]);
        }

        executorService.shutdown();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}