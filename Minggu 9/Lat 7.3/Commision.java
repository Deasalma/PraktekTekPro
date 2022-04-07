package lat7_3;

public class Commision extends Hourly {
	double totalSale;
	double comissionRate;
	
	public Commision (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission) {
		super (eName, eAddress, ePhone, socSecNumber, rate);
		comissionRate = commission;
	}
	public void addSales (double totalSales) {
		totalSale = totalSales;
	}
	public double pay() {
		double payment = super.pay()+(totalSale*comissionRate);
		return payment;
	}
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sale: " + totalSale;
		return result;
	}
}

	