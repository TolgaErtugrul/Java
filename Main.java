
public class Main {

	
	public static void main(String[] args) {
		Ogrenci ali = new Ogrenci("Ali", "Tip", 1, 0);
		Ogrenci veli = new Ogrenci("Veli", "Psikoloji", 2, 45);
		Ogrenci ayse = new Ogrenci("Ayse", "Endustri", 1, 25);
		
		
		System.out.println(ali);
		System.out.println(veli);
		System.out.println(ayse);
		
		String aliIsim = ali.getIsim();
		String aliBolum = ali.getBolum();
		int aliSinif = ali.getSinif();
		int aliKredi = ali.getKredi();
		
		System.out.println(aliIsim);
		System.out.println(aliBolum);
		System.out.println(aliSinif);
		System.out.println(aliKredi);
		
		
		ayse.setBolum("Bilgisayar");
		ayse.setSinif(3);
		ayse.setKredi(65);
		
		System.out.println(ayse);
		System.out.println(ayse.getKredi());
		
		int[] dersler = {3, 4, 3, 3}; 
		int toplamKredi = ali.gecilenDersleriIsle(dersler);
		
		System.out.println(toplamKredi);
		System.out.println(ali.getKredi());
		System.out.println(ali.sinifAtla());
		System.out.println(ali);
		
		int[] dersler2 = {3, 4, 3, 3};
		ali.gecilenDersleriIsle(dersler2);
		System.out.println(ali.getKredi());
		System.out.println(ali.sinifAtla());
		System.out.println(ali);
		
		veli.bolumDegistir("Sosyoloji");
		System.out.println(veli);
		System.out.println(veli.getKredi());
	}
}
