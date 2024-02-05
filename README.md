jvya odev 1:
Bu ödev iki bölümden oluşmaktadır. Öncelikle aşağıdaki soruya cevap hazırlamalısınız. Daha sonra Calisan sınıfını yazmalısınız.

Bölüm 1:

Bu bölümdeki karmaşıklık sorusunun cevabını ve AÇIKLAMASINI ikinci bölüm için göndereceğiniz kodunuzun içine, ilk satıra açıklama (comment) olarak yazabilirsiniz. Açıklama içermeyen cevaplar değerlendirilmeyecektir. 

Aşağıdaki döngülerin karmaşıklığı nedir ?

1)
result = 0;
for(int i = 0; i < N; i++)
    for(int j = i; j > 0; j--)
        result++;

2)
result = 1;
for(int i = 1; i <= N; i+=2)
    result*=i;

Bölüm 2:

Ödevin bu kısmında bir çalışanı kapsülleme yaklaşamına uygun olarak basitçe modelleyeceğiz ve model üzerinde çeşitli işlemler tanımlayacağız.

Bunun için bir Ogrenci sınıfı oluşturmanız gerekiyor ve 

String isim;
String bolum;
int sinif;
int kredi; 
öz niteliklerine sahip olması gerekiyor. Bu öz niteliklerin private olması gerektiğine dikkat ediniz.

Bu sınıfın tek yapıcısı olmalıdır:

Bu yapıcı 4 tane argüman almalıdır: isim, bolum, sinif, kredi.
Eğer sinif 1 ile 6 arasında değil ise, throw ile RuntimeException("Sinif 1 ile 6 arasinda olabilir.") şeklinde hata fırlatılmalıdır.
Eğer kredi negatif ise, throw ile RuntimeException("Kredi negatif olamaz.") şeklinde hata fırlatılmalıdır.
Ogrenci sınıfının 4 tane get (public) işlevi olmalıdır. İsimleri şu şekildedir ve argümansız tanımlanmalıdır:

String getIsim()
String getBolum()
int getSinif()
int getKredi()
Ogrenci sınıfının 3 tane set fonksiyonu olmalıdır. İsimleri ve aldıkları
argümanlar şu şekildedir:

void setBolum(String bolum) 
void setSinif(int sinif) 
void setKredi(int kredi)    
setSinif ve setKredi fonksiyonları sinif ve kredi öznitelikleri için yapıcı metotta olduğu gibi geçerlilik kontrolü yapar ve geçersiz değerler için ilgili hataları fırlatır.

Ogrenci sınıfının ayrıca 4 tane (public) işlevi olacaktır. İsimleri, aldıkları argümanlar ve döndükleri değerler şu şekildedir:

int gecilenDersleriIsle(int[] dersKredileri)
Geçilen derslerin kredi toplamını hesaplar, fonksiyonun döndüğü değer de bu toplam değeridir.
Dizide negatif kredi var ise, throw ile RuntimeException("Dizi negatif kredi iceremez.") hatasını fırlatmalıdır.
Verilen dizideki toplam kredi değeri 10 ile 15 arasında olmalıdır. Aksi takdirde throw ile RuntimeException("Bir donemde alinan derslerin toplam kredisi 10 ile 15 arasinda olmalidir.") hatasını fırlatmalıdır. 
Ogrenci'nin kredi değerine hesaplanan toplamı ekleyerek bu özniteliği günceller. 
boolean sinifAtla()
Ogrencinin sinifi ile toplam kredisini kontrol ederek, yeterli krediye ulaşan öğrenciyi sınıf atlatır. Bu kontrol her bir sınıf için en az 20 kredinin tamamlanmasına bağlıdır. Yani 1. sınıfı geçebilecek öğrenci en az 20 kredi, 2.sınıfı geçebilecek öğrenci en az 40 krediye sahip olmalıdır. Hesaplama üst sınıflar için doğrusal bir şekilde devam eder.
Eğer öğrenci sınıfı geçebiliyorsa var olan sınıfı 1 artırılır ve true değeri dönülür.
Kredisi yetmeyen öğrenci için özniteliklerde değişiklik olmaz ve false değeri dönülür.
void bolumDegistir(String yeniBolum)
Bu fonksiyon öğrencinin bolum özniteliğini verilen argümanla günceller.
Öğrenci ilk döneminden bölüm değiştiremez dolayısıyla 0 kredili öğrenci için bu fonksiyon çağrılırsa throw ile RuntimeException("Sifir kredili ogrenci bolum degistiremez.") hatasını fırlatmalıdır.
Öğrenci almış olduğu tüm dersleri saydıramayacağı için almış olduğu toplam kredi miktarı yarıya düşer.
Öğrenci yeni bölümüne 1.sınıftan devam eder.
toString()
<isim>, <bolum>, <sinif>.sinif  formatında bir String dönmelidir (Ekteki örnek çıktıyı inceleyiniz). 

Çıktı:
Ali, Tip, 1. sinif
Veli, Psikoloji, 2. sinif
Ayse, Endustri, 1. sinif
Ali
Tip
1
0
Ayse, Bilgisayar, 3. sinif
65
13
13
false
Ali, Tip, 1. sinif
26
true
Ali, Tip, 2. sinif
Veli, Sosyoloji, 1. sinif
22
