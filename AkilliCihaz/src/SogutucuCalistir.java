
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
			arayuz.mesajGoruntule("So�utucu ba�ar� ile �al��t�r�lm��t�r");
		
		else
			arayuz.mesajGoruntule("So�utucu hali haz�rda �al��maktad�r");
	}
}
