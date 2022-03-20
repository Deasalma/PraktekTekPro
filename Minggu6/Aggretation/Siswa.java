package Aggregation;

public class Siswa {
	School sekolah;
	String nama;
	
public Siswa(String nama, School sekolah) {
	this.nama = nama;
	this.sekolah = sekolah;
}

void display(){  
	System.out.println("Nama: "+ nama );  
	System.out.println("Nama Sekolah: "+ sekolah.nama +"\n"+"Alamat Sekolah : "+ sekolah.address);  
}  
}
