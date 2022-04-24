package Decorator;

public abstract class TraSuaDecorator implements ITraSua {

    private final ITraSua trasua;

    protected TraSuaDecorator(ITraSua traSua) {
        trasua = traSua;

    }

    @Override
    public int Cost() {
        return this.trasua.Cost();
    }
}
