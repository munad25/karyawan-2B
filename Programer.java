public class Programer extends Karyawan{

	final void showProfile(){
		setJabatan("Programer");


		System.out.println("Nama :" + getNama());
		System.out.println("Alamat :" + getAlamat());
		System.out.println("Jabatan :" + getJabatan());

	}


	final void showJabatan(){
		System.out.println("Jabatan : Programer");
	}

	public void addGaji(int addGaji){
		System.out.println("Gaji anda Sekarang" + gaji);
		if ((gaji + addGaji) <= maxGajiProgramer) {
			gaji += addGaji;
			System.out.println("gaji anda ditambah :" + addGaji);
			System.out.println("Gaji anda Sekarang" + gaji + "\n");
		}
		else{
			gaji = maxGajiProgramer;
			System.out.println("Gaji Sudah mencapai batas maksimal");
			System.out.println("Gaji anda Sekarang" + gaji + "\n");
		}
	}


	public void addGaji(int addGaji, int noref){
		System.out.println("Gaji anda Sekarang" + gaji);
		if ((gaji + addGaji) <= maxGajiProgramer) {
			gaji += addGaji;
			System.out.println("gaji anda ditambah :" + addGaji);
			System.out.println("Gaji anda Sekarang" + gaji);
			System.out.println(noref + "\n");
		}
		else{
			gaji = maxGajiProgramer;
			System.out.println("Gaji Sudah mencapai batas maksimal");
			System.out.println("Gaji anda Sekarang" + gaji + "\n");
		}
	}
}