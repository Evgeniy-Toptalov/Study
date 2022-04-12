package FirstQuarter.Java2.Lesson1;

public class Robot implements Participant {
    private int id;

    public Robot(int id) {
        this.id = id;
    }

    public int run(){
        return 100;
    }

    @Override
    public int jump() {
        return 3;
    }

    @Override
    public String toString() {
        return "Robot " + id;
    }
}
