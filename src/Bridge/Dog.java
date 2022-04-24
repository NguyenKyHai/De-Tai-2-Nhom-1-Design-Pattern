package Bridge;

public class Dog extends Animal{
    private int timesADay, amount;
    private String typeOfFood;

    public Dog(int timesADay, int amount, String typeOfFood, IFeeding feeding) {
        super(feeding);
        this.timesADay = timesADay;
        this.amount = amount;
        this.typeOfFood = typeOfFood;
    }

    public void feed() {
        feeding.feed(timesADay, amount, typeOfFood);
    }
}
