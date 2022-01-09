
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate=0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply+vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		System.out.println("Value of supply:"+valueOfSupply);
		System.out.println("VAT:"+vat);
		System.out.println("Total:"+total);
		System.out.println("Expense:"+expense);
		System.out.println("Income:"+income);
		
		double[] dividenedRates = new double[3];
		dividenedRates[0]=0.5;
		dividenedRates[1]=0.3;
		dividenedRates[2]=0.2;
		
		int i=0;
		while(i<dividenedRates.length) {
			System.out.println("Dividend :"+(income*dividenedRates[i]));
			i=i+1;
		}


	}

}
