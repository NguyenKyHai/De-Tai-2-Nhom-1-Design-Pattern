package ChainOfResponsibility;

public class Number {
	private int	number1;
	private int number2;
	private String calculationWanted;

	public Number(int number1,int number2, String calculationWanted)
	{
		this.number1 = number1;
		this.number2 = number2;
		this.calculationWanted = calculationWanted;
	}

	public int getNumber2() {
		return number2;
	}public int getNumber1() {
		return number1;
	}
	public String getCalcWanted(){ return calculationWanted; }

}
