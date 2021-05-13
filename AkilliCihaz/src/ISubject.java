
public interface ISubject {
	public void attach(IObserver observer);
    public void detach(IObserver observer);
    public void notify(String mesaj);
}
/*
@Override
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
			observer.update(mesaj);
	}
*/