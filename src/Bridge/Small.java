package Bridge;

public class Small implements IFeeding {

    @Override
    public void feed(int timesADay, int amount, String typeOfFood) {
        System.out.println("Cho con chó nhỏ ăn "
                + amount + " gam " + typeOfFood + " " + timesADay + " lần một ngày ");
    }

}
