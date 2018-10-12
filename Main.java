public class Main{
	public static void main(String[] args) {
		Designer d = new Designer();
		PM p = new PM();
		Programer  pro = new Programer();

		d.setProfile("Muhamad Nadi", "Lelea City");
		p.setProfile("Nadi Poenya", "Lelea City");
		pro.setProfile("Mumunad POenya", "Lelea City");


		d.showProfile();
		d.addGaji(30);
		d.addGaji(30, 98765);
		d.addGaji(30);

		p.addGaji(30);
		p.addGaji(30, 98765);
		p.addGaji(30);

		pro.addGaji(30);
		pro.addGaji(30, 98765);
		pro.addGaji(30);

	}
}