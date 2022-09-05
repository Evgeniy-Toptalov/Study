package FirstQuarter.Java3.Lesson4;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;


public class HomeWork4 {
    public static void main(String[] args) throws IOException {
        PrintABC print = new PrintABC();
        String letter = "А";
        String letter2 = "А";
        System.out.println(letter.equals(letter2));
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(10);
                    print.printA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(20);
                    print.printB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(30);
                    print.printC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        thread1.start();
        thread2.start();
        thread3.start();


        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main end");


    }
}
