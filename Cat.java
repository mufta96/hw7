package lesson7.oop;

//import java.util.Random;

public class Cat {

    private String name;
    private int hunger;
    //private Random random = new Random();

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }
// смотри сколько еды в тарелке, если больше или равно голоду съедаем до сытости (hunger = 0) если меньше еды чем наш голод едим сколько есть.
    public void eat(Plate plate) {
        if (plate.food_amount() >= this.hunger){
            plate.decreaseFood(this.hunger);
            this.hunger = 0;
        }
        else
        {
            this.hunger -= plate.food_amount();
            plate.decreaseFood(plate.food_amount());
        }
        System.out.printf("\n\nЕды в тарелке: %d \n Кот %s голоден на %d ", plate.food_amount(), this.name, this.hunger);
    }
}
