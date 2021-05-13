
public class Servis implements IObserver {
	@Override
	public void update(String mesaj) {
		System.out.println(mesaj+" servise bildirilmiþtir");
	}
}
