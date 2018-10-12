public class Karyawan{
	private String nama;
	private String alamat;

	protected String jabatan;
	protected int gaji;

	final int maxGajiDesigner = 70;
	final int maxGajiPM = 100;
	final int maxGajiProgramer = 90;

	private void addGaji(int addGaji){
		gaji += addGaji;
		System.out.println("Gaji anda :" + gaji );
	}

	private void addGaji(int addGaji, int noref){
		gaji += addGaji;
		System.out.println("Gaji anda :" + gaji );
		System.out.println(noref);

	}

	public void setProfile(String setNama, String setAlamat){
		nama = setNama;
		alamat = setAlamat;
	}

	public String getNama(){
		return nama;
	}

	public String getAlamat(){
		return alamat;
	}

	protected void setJabatan(String setJabatan){
		jabatan = setJabatan;
	}

	protected String getJabatan(){
		return jabatan;
	}

	public int getGaji(){
		return gaji;
	}

}