package FirstQuarter.Java2.Lesson1;

public class Cat implements Participant {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 500;
    }

    @Override
    public int jump() {
        return 1;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}
