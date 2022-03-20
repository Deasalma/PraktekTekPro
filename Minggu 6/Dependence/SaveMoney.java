package Depedence;

public class SaveMoney {
	public String idPassword;
	public String namaNasabah;
	public int money;
	
	public SaveMoney(Nasabah nasabah) {
		idPassword = nasabah.getPassword();
		namaNasabah = nasabah.getNameNasabah();
		money = nasabah.getUang();
		
		System.out.println(idPassword);
	    System.out.println(namaNasabah);
	    System.out.println(money);
		System.out.println("\n");
	}

}

