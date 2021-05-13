
public class SogutucuKapat implements IIslem {
	private IEyleyici eyleyici;
	private IAgArayuzu arayuz;
	SogutucuKapat(IEyleyici eyleyici,IAgArayuzu arayuz)
	{
		this.eyleyici=eyleyici;
		this.arayuz=arayuz;
	}
	@Override
	public void islemYap() {
		if(eyleyici.setDurum(false))
			arayuz.mesajGoruntule("So�utucu ba�ar� ile kapat�lm��t�r");
			
		else
			arayuz.mesajGoruntule("So�utucu hali haz�rda kapal�d�r");
	}
}
