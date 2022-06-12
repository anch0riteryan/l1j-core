package l1j.server;


import org.apache.log4j.PropertyConfigurator;

public class Log {
	private static final String LOGGER_PROPERTIES_PATH = "./config/log4j.properties";
	private static Log instance;

	public static Log getInstance () {
		return instance;
	}

	public static void initialize () {
		if (instance != null) {
			return;
		}

		instance = new Log ();
	}

	private Log () {
		try {
			PropertyConfigurator.configure (LOGGER_PROPERTIES_PATH);
		} catch (Exception e) {
			e.printStackTrace ();
			System.exit (1);
		}
	}
}
