package Decorator;

public class TraiCay extends TraSuaDecorator{
    
    public TraiCay(ITraSua traSua) {
        super(traSua);
    }
 @Override
    public int Cost() {
        return 2+super.Cost();
    }
}
