package Aggregation;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sekolah1 = new School("SMAN 1 Bandung", "Bandung");
		School sekolah2 = new School("SMAN 2 Bandung", "Bandung");
		
		Siswa s1 = new Siswa("Budi", sekolah1);
		Siswa s2 = new Siswa("Citra", sekolah2);
		
		s1.display();
		System.out.println("\n");
		s2.display();
	}

}
