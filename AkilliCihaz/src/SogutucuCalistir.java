
public class SogutucuCalistir implements IIslem {
	private IEyleyici eyleyici;
	private IAgArayuzu arayuz;
	SogutucuCalistir(IEyleyici eyleyici,IAgArayuzu arayuz)
	{
		this.eyleyici=eyleyici;
		this.arayuz= arayuz;
	}
	@Override
	public void islemYap() {
		if(eyleyici.setDurum(true))
			arayuz.mesajGoruntule("Soğutucu başarı ile çalıştırılmıştır");
		
		else
			arayuz.mesajGoruntule("Soğutucu hali hazırda çalışmaktadır");
	}
}
