package FirstQuarter.Lesson6;

public class Animal {

    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected static int count = 0;


    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int Run) {
        if (maxRun == 0) {
            System.out.println(name + " не умеет бегать");
        } else if (Run > 0 && Run < maxRun) {
            System.out.println(name + " бежит " + Run + "м");
        } else {
            System.out.println(name + " не может пробежать " + Run + "м");
        }
    }

    public void swim(int Swim) {
        if (maxSwim == 0) {
            System.out.println(name + " не умеет плавать");
        } else if (Swim > 0 && Swim < maxSwim) {
            System.out.println(name + " плывёт " + Swim + "м");
        } else {
            System.out.println(name + " не может проплыть " + Swim + "м");
        }
    }

    public static int getCount(){
        return count;
    }
}
