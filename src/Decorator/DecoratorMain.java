package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
       ITraSua trasua = new TraSua();
       ITraSua trasua1=new DuongDen(new TranChau(new TraSua()));
       
       System.out.println(trasua.Cost());
       System.out.println(trasua1.Cost());
    }
}
