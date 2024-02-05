//s27123 Tolga Ertuğrul
// BOLUM 1 //
//İlk döngü de iki adet iç içe döngü vardır. 
//İlk döngü N kez döner, ikinci döngü i kez döner. 
//Toplam adım sayısı N + (N-1) + (N-2) + ... + 1'dir, ve bu toplam, N(N+1)/2 olur. Döngünün karmaşıklığı O(N^2)'dir.

//İkinci döngü sadece tek sayıları kullanır ve her bir adımda result değişkenini çarpar. 
//N adet tek sayı olduğundan, döngünün karmaşıklığı O(N) 'dir.

// BOLUM 2 //
public class Ogrenci {
	private String isim;
	private String bolum;
	private int sinif;
	private int kredi;

	Ogrenci(String isim, String bolum, int sinif, int kredi){
		if(sinif<1 || sinif>6) throw new RuntimeException("Sinif 1 ile 6 arasinda olabilir.");
		if(kredi<0)throw new RuntimeException("Kredi negatif olamaz.");
		this.isim = isim;
		this.bolum = bolum;
		this.sinif = sinif;
		this.kredi = kredi;
	}
	String getIsim(){
		return isim;
	}
	String getBolum(){
		return bolum;
	}
	int getSinif(){
		return sinif;
	}
	int getKredi(){
		return kredi;
	}

	void setBolum(String bolum){
		this.bolum = bolum;
	}
	void setSinif(int sinif){
		this.sinif = sinif;
	}
	void setKredi(int kredi){
		this.kredi = kredi;
	}

	int gecilenDersleriIsle(int[] dersKredileri){
		for(int eleman : dersKredileri){
			if(eleman < 0)throw new RuntimeException("Dizi negatif kredi iceremez.");
		}
		
		int toplam = 0;
        for (int i = 0; i < dersKredileri.length; i++) {
            toplam += dersKredileri[i];
        }
		if(toplam<10 || toplam>15)throw new RuntimeException("Bir donemde alinan derslerin toplam kredisi 10 ile 15 arasinda olmalidir.");
		return kredi += toplam;
	}

	boolean sinifAtla(){
		int gerekliKredi = sinif * 20;
		if (kredi >= gerekliKredi) {
            sinif++;
            return true;
        } else {
            return false;
        }
	}

	void bolumDegistir(String yeniBolum){
		if(kredi == 0)throw new RuntimeException("Sifir kredili ogrenci bolum degistiremez.");
		kredi/=2;
		bolum = yeniBolum;
		sinif = 1;
	}

	public String toString(){
		return isim + ", " + bolum + ", " + sinif + ". sinif";
	}
}
