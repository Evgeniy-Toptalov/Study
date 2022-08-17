package FirstQuarter.Java3.Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> list = new ArrayList<>();

    public void addApple(Apple apple) {
        list.add((T) apple);
    }

    public void addOrange(Fruit orange) {
        list.add((T) orange);
    }

    float getWeight() {
        return list.size() * list.get(0).getWeight();
    }

    void info() {
        System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " + list.size());
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

}
