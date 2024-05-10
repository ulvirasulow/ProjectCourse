package logging;

public class DataBaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına Loglandı :" + data);
	}

}
