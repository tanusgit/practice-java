package linklist;

public class TaxCalculator2018 extends Object implements CanTaxCalculate{
	private double taxableincome;
	
	TaxCalculator2018(double income){
		taxableincome = income;
	}
	//it is good to override methods from interfaces
	@Override
	public double taxCalculator() {
		return taxableincome * .03;
	}
	

}
