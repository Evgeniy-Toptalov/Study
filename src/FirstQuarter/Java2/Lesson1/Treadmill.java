package FirstQuarter.Java2.Lesson1;

public class Treadmill implements Obstacles {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public boolean canRun(Participant participants) {
        return participants.run() >= length;
    }
}

