

public class Kayitci implements IObserver {

	@Override
	public void update(String mesaj) {
		System.out.println(mesaj+" kay�t alt�na al�nm��t�r");
	}
}
