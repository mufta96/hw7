package lesson7.oop;
//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//        (например, в миске 10 еды, а кот пытается покушать 15-20)
public class Plate {
    private int capacity=100;
    private int food;

    public void addFoot(int food) {
        this.food += food;
    }

    public void printInfo() {
        System.out.println(this);
    }
    public int food_amount () {
        return this.food;
    }

    @Override
    public String toString() {
        return "Plate: food = " + this.food;
    }

    public void decreaseFood(int food) {
        if (food<=this.food)
        this.food -= food;

    }
}
