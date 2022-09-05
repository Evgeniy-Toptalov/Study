package FirstQuarter.Java3.Lesson4;


public class PrintABC {
    private final Object lock = new Object();

    private volatile char letter = 'A';


    public void printA() throws InterruptedException {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                while (letter != 'A'){
                    lock.wait();
                }
                System.out.println('A');
                letter = 'B';
                lock.notifyAll();
            }
        }
    }

    public void printB() throws InterruptedException {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                while (letter != 'B'){
                    lock.wait();
                }
                System.out.println('B');
                letter = 'C';
                lock.notifyAll();
            }
        }
    }

    public void printC() throws InterruptedException {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                while (letter != 'C'){
                    lock.wait();
                }
                System.out.println('C');
                letter = 'A';
                lock.notifyAll();
            }
        }
    }
}
