package Depedence;

public class main {
	
	public static void main(String[] args) {
	Nasabah n1 = new Nasabah();
	Nasabah n2 = new Nasabah();
	
	n1.setPassword("F4567");
	n1.setNameNasabah("Andin");
	n1.setUang(100_000);
	
	n2.setPassword("F4590");
	n2.setNameNasabah("Ayu");
	n2.setUang(200_000);
	
	SaveMoney m1 = new SaveMoney(n1);
	SaveMoney m2 = new SaveMoney(n2);
	}
}
