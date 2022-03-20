package Association;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guru guru = new Guru("Bu Isda");
		Siswa siswa = new Siswa("Andin");
		siswa.setKelas(1);
		System.out.println("Nama 		:" +siswa.getNama());
		System.out.println("Kelas    	:" +siswa.getKelas()+"\nMerupakan Siswa Dari  : ");
		System.out.println(guru.getNamaClub());
		
	}
}

