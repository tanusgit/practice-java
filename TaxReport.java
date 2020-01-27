package linklist;

public class TaxReport {
	//private TaxCalculator2018 calculator;
	//treating interface like a primitive type then creating a variable of that type
	private CanTaxCalculate cal;
	
	//TaxReport(){
	//	calculator = new TaxCalculator2018(500000);
	//}
	TaxReport(CanTaxCalculate m){
		cal = m;
	}
	public void show() {
		double result = cal.taxCalculator();
		System.out.print(result);
	}

}
