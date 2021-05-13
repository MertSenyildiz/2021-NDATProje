import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu {

	@Override
	public void mesajGoruntule(String mesaj) {
		System.out.println(mesaj);
	}

	@Override
	public String veriAl() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}

}
