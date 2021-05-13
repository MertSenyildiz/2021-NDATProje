import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SicaklikOlcer implements ISicaklikOlcer {
	private double sicaklik;
	private Random rnd;
	ISubject sorunBildirici;
	SicaklikOlcer(ISubject sorunBildirici)
	{	
		this.sorunBildirici=sorunBildirici;
		rnd= new Random();
		setSicaklik();
	}
	public double getSicaklik() {
		// TODO Auto-generated method stub
		setSicaklik();
		return sicaklik;
	}
	private void setSicaklik()
	{
		this.sicaklik=rnd.nextDouble()+rnd.nextInt(80)-25;
		if(sicaklik>=40)
			sorunBildirici.notify("Sogutucu sicakliði "+String.format("%,.2f", sicaklik)+"C");
	}

}
