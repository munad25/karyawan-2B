public class Designer extends Karyawan{


	final void showProfile(){
		setJabatan("Designer");


		System.out.println("Nama :" + getNama());
		System.out.println("Alamat :" + getAlamat());
		System.out.println("Jabatan :" + getJabatan());

	}

	public void addGaji(int addGaji){
		System.out.println("Gaji anda Sekarang" + gaji);
		if ((gaji + addGaji) <= maxGajiDesigner) {
			gaji += addGaji;
			System.out.println("gaji anda ditambah :" + addGaji);
			System.out.println("Gaji anda Sekarang" + gaji + "\n");
		}
		else{
			gaji = maxGajiDesigner;
			System.out.println("Gaji Sudah mencapai batas maksimal");
			System.out.println("Gaji anda Sekarang" + gaji + "\n");
		}
	}

	public void addGaji(int addGaji, int noref){
		System.out.println("Gaji anda Sekarang" + gaji);
		if ((gaji + addGaji) <= maxGajiDesigner) {
			gaji += addGaji;
			System.out.println("gaji anda ditambah :" + addGaji);
			System.out.println("Gaji anda Sekarang" + gaji);
			System.out.println(noref + "\n");
		}
		else{
			gaji = maxGajiDesigner;
			System.out.println("Gaji Sudah mencapai batas maksimal \n");
			System.out.println("Gaji anda Sekarang" + gaji + "\n");
		}
	}

}