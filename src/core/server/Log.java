package core.server;

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
			//TODO
		} catch (Exception e) {
			e.printStackTrace ();
			System.exit (-1);
		}
	}
}
