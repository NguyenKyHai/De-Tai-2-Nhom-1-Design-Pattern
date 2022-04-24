package Decorator;

public class TranChau extends TraSuaDecorator {

    public TranChau(ITraSua traSua) {
        super(traSua);
    }

    @Override
    public int Cost() {
        return 1 + super.Cost();
    }

}
