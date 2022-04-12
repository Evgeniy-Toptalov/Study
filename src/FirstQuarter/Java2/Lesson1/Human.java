package FirstQuarter.Java2.Lesson1;

public class Human implements Participant {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public int run(){
        return 1000;
    }

    @Override
    public int jump() {
        return 2;
    }

    @Override
    public String toString() {
        return "Human " + name;
    }
}
