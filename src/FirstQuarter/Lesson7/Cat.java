package FirstQuarter.Lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFoodQuantity()) {
            System.out.println(name + " начал есть, съел " + appetite);
            plate.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println(name + " недостаточно еды");
        }
    }

}
