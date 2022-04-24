package Bridge;

public abstract class Animal {
    protected IFeeding feeding;

    protected Animal(IFeeding feeding) {
        this.feeding = feeding;
    }
    public abstract void feed();
}
