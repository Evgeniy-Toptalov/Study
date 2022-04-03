package FirstQuarter.Lesson7;

public class Plate {

    private int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void info() {
        System.out.println("Текущее кол-во еды " + foodQuantity);
    }

    public void decreaseFood(int foodQuantity) {
        if (this.foodQuantity >= foodQuantity) {
            this.foodQuantity -= foodQuantity;
        }
    }

    public void addingEat(int bonusEat) {
        this.foodQuantity += bonusEat;
    }
}
