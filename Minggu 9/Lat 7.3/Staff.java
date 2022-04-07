package lat7_3;

public class Staff {
StaffMember[] staffList;
	public Staff() {
	staffList = new StaffMember[8];
	staffList[0] = new Executive ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
	staffList[1] = new Employee ("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
	staffList[2] = new Employee ("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
	staffList[3] = new Hourly ("Diane", "678 Fifth Ave", "555-0690", "958-47-3625", 10.55);
	staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8374");
	staffList[5] = new Volunteer ("Cliff", "321 Duds Lane", "555-7282");
	staffList[6] = new Commision ("Dea", "Cianjur", "555-908", "675-78-098", 6.25, 0.2);
	staffList[7] = new Commision ("Mey", "Cimahi", "555-076", "789-09-123", 9.75, 0.15);
	((Executive)staffList[0]).awardBonus (500.00);
	((Hourly)staffList[3]).addHours (40);
	((Commision)staffList[6]).addHours(35);
	((Commision)staffList[6]).addSales(400);
	((Commision)staffList[7]).addHours(40);
	((Commision)staffList[7]).addSales(950);
	}
	public void payday () {
		double amount;
		for (int count=0; count <staffList.length;  count++) {
			System.out.println (staffList[count]);
			amount = staffList[count].pay();
			
			if (amount == 0.0)
				System.out.println ("Thanks");
			else
				System.out.println ("Paid:" + amount);
			
			System.out.println("-----------------------------");
		}
	}
}