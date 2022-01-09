
public class AccountingArrayApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate=0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply+vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		double[] dividenedRates = new double[3];
		dividenedRates[0]=0.5;
		dividenedRates[1]=0.3;
		dividenedRates[2]=0.2;
		double dividend1 = income * dividenedRates[0];
		double dividend2 = income * dividenedRates[1];
		double dividend3 = income * dividenedRates[2];
		
		System.out.println("Value of supply:"+valueOfSupply);
		System.out.println("VAT:"+vat);
		System.out.println("Total:"+total);
		System.out.println("Expense:"+expense);
		System.out.println("Income:"+income);
		System.out.println("Dividend 1:"+dividend1);
		System.out.println("Dividend 2:"+dividend2);
		System.out.println("Dividend 3:"+dividend3);


	}

}
