

public class Kayitci implements IObserver {

	@Override
	public void update(String mesaj) {
		System.out.println(mesaj+" kayýt altýna alýnmýþtýr");
	}
}
