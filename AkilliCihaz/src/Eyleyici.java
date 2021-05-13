
public class Eyleyici implements IEyleyici {
	private boolean durum=false;
	public boolean setDurum(boolean durum) {
		if(this.durum !=durum)
		{
			this.durum = durum;
			return true;
		}
		return false;
	}
}
