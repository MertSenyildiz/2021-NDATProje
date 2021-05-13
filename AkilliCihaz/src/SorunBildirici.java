import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SorunBildirici implements ISubject {
	List<IObserver> observers;
	public SorunBildirici()
	{
		observers= new ArrayList<IObserver>();
	}
	public void attach(IObserver observer) {
		observers.add(observer);
	}
	@Override
	public void detach(IObserver observer) {
		observers.remove(observer);
	}
	@Override
	public void notify(String mesaj) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		for(IObserver observer:observers)
			observer.update(" "+dtf.format(now)+" tarihinde "+mesaj);
	}

}
