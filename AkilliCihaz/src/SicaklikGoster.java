
public class SicaklikGoster implements IIslem {
	private ISicaklikOlcer termometre;
	private IAgArayuzu arayuz;
	SicaklikGoster(ISicaklikOlcer termometre,IAgArayuzu arayuz)
	{
		this.termometre=termometre;
		this.arayuz=arayuz;
	}
	@Override
	public void islemYap() {
		arayuz.mesajGoruntule("Sicaklik:"+String.format("%,.2f",termometre.getSicaklik())+"C");
	}

}
