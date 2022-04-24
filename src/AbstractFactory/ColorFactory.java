package AbstractFactory;

public class ColorFactory implements IAbstractFactory<IColor> {

    @Override
    public IColor create(String color) {
        if ("White".equalsIgnoreCase(color)) {
            return new WhiteColor();
        } else if ("Black".equalsIgnoreCase(color)) {
            return new BlackColor();
        } else if ("Brown".equalsIgnoreCase(color)) {
            return new BrownColor();
        }
        return null;
    }
}