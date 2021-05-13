
public class AkilliCihaz {
	private ISicaklikOlcer termometre;
	private IAgArayuzu arayuz;
	private IEyleyici eyleyici;
	private ISubject sorunBildirici;
	private static final int SICAKLIK_GORUNTULE = 1;
	private static final int SOGUTUCU_CALISTIR = 2;
	private static final int SOGUTUCU_KAPAT = 3;
	private static final int CIKIS = 4;
	
	AkilliCihaz()
	{	
		this.sorunBildirici = new SorunBildirici();
		this.sorunBildirici.attach(new Kayitci());
		this.sorunBildirici.attach(new Servis());
		this.eyleyici=new Eyleyici();
		this.termometre=new SicaklikOlcer(sorunBildirici);
		this.arayuz=new AgArayuzu();
	}
	public void basla()
	{
		if(girisDogrulama() !=null)
		{
			arayuz.mesajGoruntule("******GIRIS ISLEMI BASARILI******");
			IIslem islem;
			int secim ;
			do
			{
				secim = Menu();
				switch(secim)
				{
					case SICAKLIK_GORUNTULE:
						islem=new SicaklikGoster(termometre,arayuz);
						islem.islemYap();
						break;
					case SOGUTUCU_CALISTIR:
						islem=new SogutucuCalistir(eyleyici,arayuz);
						islem.islemYap();
						break;
					case SOGUTUCU_KAPAT:
						islem=new SogutucuKapat(eyleyici,arayuz);
						islem.islemYap();
						break;
					case CIKIS:
						arayuz.mesajGoruntule("******CIKIS YAPILMISTIR******");
						break;
					default:
						arayuz.mesajGoruntule("******GECERLI BIR ISLEM SECINIZ******");
						break;
				}
				
			}while(secim!=4);
			
		}
		else
			arayuz.mesajGoruntule("******KULLANICI ADI VEYA SIFRE HATALI******");
	}
	private IKullanici girisDogrulama()
	{
		IVeritabaniSurucu veritabani = new PostgreSqlSurucu();
		arayuz.mesajGoruntule("******GIRIS YAPINIZ******");
		arayuz.mesajGoruntule("Kullanici adi:");
		String kullaniciAdi=arayuz.veriAl();
		arayuz.mesajGoruntule("Sifre:");
		String sifre=arayuz.veriAl();
		arayuz.mesajGoruntule("******GIRIS YAPILIYOR******");
		return veritabani.kullaniciDogrula(kullaniciAdi, sifre);
	}
	private int Menu()
	{
		arayuz.mesajGoruntule("------ANA MENU------");
		arayuz.mesajGoruntule("1-Sicaklik Goruntule");
		arayuz.mesajGoruntule("2-Sogutucuyu Calistir");
		arayuz.mesajGoruntule("3-Sogutucuyu Kapat");
		arayuz.mesajGoruntule("4-Cikis");
		arayuz.mesajGoruntule("Seciminiz:");
		return Integer.parseInt(arayuz.veriAl());
	}
}
