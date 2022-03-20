package Composition;
import java.util.ArrayList;
import java.util.List;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personal tanggallahir1 = new Personal("Dea Salma ", "23 Desember 2002");
		Personal tanggallahir2 = new Personal("Yasmin Azizah", "1 Januari 2003");
		Personal tanggallahir3 = new Personal("Mentari ayu", "2 Februari 2002");
		Personal tanggallahir4 = new Personal("Rahma Alia", "1 April 2004");

		List<Personal> personals = new ArrayList<Personal>();
		personals.add(tanggallahir1);
		personals.add(tanggallahir2);
		personals.add(tanggallahir3);
		personals.add(tanggallahir4);
		tglKelahiran kelahiran = new tglKelahiran(personals);
		List<Personal> var = kelahiran.getPersonal();
			for(Personal sVar : var){
				System.out.println("Nama 		: " + sVar.nama + "\n"+"Tanggal Lahir 	: " + sVar.tanggalLahir);
				System.out.println("\n");
			}
	}

}


