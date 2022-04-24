package Decorator;

public class DuongDen extends TraSuaDecorator{

    public DuongDen(ITraSua traSua) {
        super(traSua);
    }

    @Override
    public int Cost() {
        return 2+super.Cost();
    }
    
    
}
