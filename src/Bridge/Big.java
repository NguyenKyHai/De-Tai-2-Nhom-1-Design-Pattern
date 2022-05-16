package Bridge;

public class Big implements IFeeding {

    @Override
    public void feed(int timesADay, int amount, String typeOfFood) {
        System.out.println("Cho con chó lớn ăn "
                + amount + " gam " + typeOfFood + " " + timesADay + " lần một ngày ");

    }
}
