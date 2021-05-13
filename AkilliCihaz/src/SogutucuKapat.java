
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
			arayuz.mesajGoruntule("Soðutucu baþarý ile kapatýlmýþtýr");
			
		else
			arayuz.mesajGoruntule("Soðutucu hali hazýrda kapalýdýr");
	}
}
